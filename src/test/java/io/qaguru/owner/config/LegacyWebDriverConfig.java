package io.qaguru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {

    public URL getRemoteUrl() {
        String remoteUrl = System.getProperty("remoteUrl");
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "https://github.com";
        }
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    public String getBaseUrl() {
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
            return baseUrl;
        }

        public Browser getBrowser () {
            //зачитываем данные из ком строки
            String browser = System.getProperty("browser");
            //обрабатыввем дефолт значение
            if (Objects.isNull(browser)) {
                browser = "CHROME";
            }
                // конвертируем в возвращаемый тип
                return Browser.valueOf(browser);
            }
        }
