package integration.net.sharplab.deepl4j;

import net.sharplab.deepl4j.DeepLApi;
import net.sharplab.deepl4j.DeepLApiFactory;
import net.sharplab.deepl4j.client.ApiException;
import net.sharplab.deepl4j.model.GlossaryLanguagePairs;
import net.sharplab.deepl4j.model.Language;
import net.sharplab.deepl4j.model.Translations;
import net.sharplab.deepl4j.model.Usage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DeepLApiTest {

    private DeepLApi target;

    @BeforeEach
    public void setup(){
        String apiKey = System.getenv("DEEPL_AUTH_KEY");
        target = new DeepLApiFactory().create(apiKey);
    }

    @Test
    public void translateText_test() throws ApiException {
        try{
            Translations response = target.translateTexts(
                    Arrays.asList("This is a pen.", "This is an apple."),
                    "EN",
                    "JA",
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
            );
            assertThat(response.getTranslations()).hasSize(2);
        }
        catch (ApiException e){
            throw e;
        }
    }

    @Test
    public void getGlossaryLanguagePairs_test() throws ApiException {
        GlossaryLanguagePairs response = target.getGlossaryLanguagePairs();
        assertThat(response.getSupportedLanguages()).isNotEmpty();
    }

    @Test
    public void getUsage_test() throws ApiException {
        Usage response = target.getUsage();
        assertThat(response).isNotNull();
    }

    @Test
    public void getLanguages_test() throws ApiException {
        List<Language> response = target.getLanguages("source");
        assertThat(response).isNotEmpty();
    }


}
