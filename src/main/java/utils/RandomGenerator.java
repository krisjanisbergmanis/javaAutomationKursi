package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {
    public static String generateRandomString() {
        return RandomStringUtils.random(10,true, false);
    }

    public static String generateRandomPhonenumber() {
        return "+371" + RandomStringUtils.random(8,false, true);
    }

    public static String generateRandomEmail() {
        return RandomStringUtils.random(7,true, false) + "." +
                RandomStringUtils.random(7,true, false) + "@" +
                RandomStringUtils.random(7,true, false) + ".com";
    }
}
