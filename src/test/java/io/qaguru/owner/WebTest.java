package io.qaguru.owner;

import io.qaguru.owner.hwconfig.СhromeOrSelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTest {

    @Test
    public void testLocalWeb(){

        System.setProperty("chromeOrSelenoid","local");

        СhromeOrSelenoidConfig config = ConfigFactory.create(СhromeOrSelenoidConfig.class, System.getProperties());

        assertThat(config.browser()).isEqualTo("CHROME");
        assertThat(config.version()).isEqualTo("101");
        assertThat(config.host()).isEqualTo("https://localhost:4444/wd/hub");
    }

    @Test
    public void testRemoteWeb(){
        System.setProperty("chromeOrSelenoid","selenoid");

        СhromeOrSelenoidConfig config = ConfigFactory.create(СhromeOrSelenoidConfig.class, System.getProperties());

        assertThat(config.browser()).isEqualTo("CHROME");
        assertThat(config.version()).isEqualTo("100");
        assertThat(config.host()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}
