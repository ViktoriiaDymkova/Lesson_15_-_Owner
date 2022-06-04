package io.qaguru.owner;

import io.qaguru.owner.config.FruitsCinfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruinsTest {

    @Test
    public void TestArray() {
        System.setProperty("array", "apple,banana,orange");

        FruitsCinfig config = ConfigFactory.create(FruitsCinfig.class, System.getProperties());
        assertThat(config.getFruitsArray())
                .containsExactly("apple", "banana", "orange");
    }

    @Test
    public void TestList() {
        System.setProperty("list", "apple,banana,orange");

        FruitsCinfig config = ConfigFactory.create(FruitsCinfig.class, System.getProperties());
        assertThat(config.getFruitsList())
                .containsExactly("apple", "banana", "orange");
    }


    @Test
    public void TestDefault() {
        FruitsCinfig config = ConfigFactory.create(FruitsCinfig.class, System.getProperties());
        assertThat(config.getFruitsDefault())
                .containsExactly("apple", "banana");
    }


    @Test
    public void TestSeparator() {
        System.setProperty("separator", "apple;banana;orange");

        FruitsCinfig config = ConfigFactory.create(FruitsCinfig.class, System.getProperties());
        assertThat(config.getFruitsSeparator())
                .containsExactly("apple", "banana", "orange");
    }
}
