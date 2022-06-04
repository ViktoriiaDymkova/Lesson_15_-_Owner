package io.qaguru.owner.hwconfig;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/secret.properties",
        "classpath:api.properties"
})
public interface ApiConfig extends Config {
    @Key("baseurl")
    @DefaultValue("https://duckduckgo.com/")
    String baseurl();

    @Key("token")
    @DefaultValue("1234567")
    String token();
}
