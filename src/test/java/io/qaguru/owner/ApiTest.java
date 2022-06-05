package io.qaguru.owner;

import io.qaguru.owner.hwconfig.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @Test
    public void testClasspathChrome() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.baseurl()).isEqualTo("https://duckduckgo.com/");
        assertThat(config.token()).isEqualTo("1234567");
    }

    @Test
    public void testClasspathSelenide() throws IOException {
        String content = "baseurl=secret.url\ntoken=secret.token";
        Path propsPath = Paths.get("/tmp/secret.properties");

        Files.write(propsPath, content.getBytes(StandardCharsets.UTF_8));

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseurl()).isEqualTo("secret.url");
        assertThat(config.token()).isEqualTo("secret.token");

        Files.delete(propsPath);
    }
}
