# DeepL4J


[![Actions Status](https://github.com/sharplab/deepl4j/workflows/CI/badge.svg)](https://github.com/sharplab/deepl4j/actions)
[![license](https://img.shields.io/github/license/sharplab/deepl4j)](https://github.com/sharplab/deepl4j/blob/master/LICENSE.txt)

DeepL API v2 client library for Java. Client library classes are auto generated by OpenAPI generator based on an unofficial DeepL OpenAPI specification.

## Getting from JitPack

DeepL4J is not yet published to Maven Central. Please use JitPack snapshot repository instead.

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependency>
    <groupId>com.github.sharplab</groupId>
    <artifactId>deepl4j</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```


## Build from source

DeepL4J uses a Gradle based build system.
In the instructions below, `gradlew` is invoked from the root of the source tree and serves as a cross-platform,
self-contained bootstrap mechanism for the build.

### Prerequisites

- Java8 or later

### Checkout sources

```
git clone https://github.com/sharplab/deepl4j
```

### Build all jars

```
./gradlew build
```

## How to use

```java 
        DeepLApi deepLApi = new DeepLApiFactory().create("<your api key>");
        try {
            Translations response = deepLApi.translate(
                    Collections.singletonList("This is a pen."),
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
        } catch (ApiException e) {
            // error handling
        }
```

## License

DeepL4J is Open Source software released under the
[Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.html).

## Contributing

Interested in helping out with DeepL4J? Great! Your participation in the community is much appreciated!
Please feel free to open issues and send pull-requests.