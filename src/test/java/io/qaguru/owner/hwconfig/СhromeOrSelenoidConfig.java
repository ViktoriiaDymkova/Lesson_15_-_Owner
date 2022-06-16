package io.qaguru.owner.hwconfig;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${chromeOrSelenoid}.properties"
})
public interface СhromeOrSelenoidConfig extends Config {
    @Key("browser.name")
    @DefaultValue("CHROME")
    String browser();

    @Key("browser.version")
    @DefaultValue("101")
    String version();

    @Key("host")
    @DefaultValue("https://localhost:4444/wd/hub")
    String host();
}
