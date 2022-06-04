package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsCinfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("list")
    List<String> getFruitsList();

    @Key("default")
    @DefaultValue("apple,banana")
    List<String> getFruitsDefault();

    @Key("separator")
    @Separator(";")
    List<String> getFruitsSeparator();
}
