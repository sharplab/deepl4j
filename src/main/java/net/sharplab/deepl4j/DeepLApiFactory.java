package net.sharplab.deepl4j;

import net.sharplab.deepl4j.client.auth.ApiKeyAuth;

public class DeepLApiFactory {

    public DeepLApi create(String apiKey){
        DeepLApi deepLApi = new DeepLApi();
        ApiKeyAuth queryApiKeyAuth =  (ApiKeyAuth) deepLApi.getApiClient().getAuthentication("QueryApiKeyAuth");
        queryApiKeyAuth.setApiKey(apiKey);
        ApiKeyAuth headerApiKeyAuth =  (ApiKeyAuth) deepLApi.getApiClient().getAuthentication("HeaderApiKeyAuth");
        headerApiKeyAuth.setApiKey(apiKey);
        headerApiKeyAuth.setApiKeyPrefix("DeepL-Auth-Key");
        return deepLApi;
    }
}
