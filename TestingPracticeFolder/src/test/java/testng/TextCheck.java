package testng;

import io.appium.java_client.MobileElement;

public interface TextCheck {
    public static boolean isText(String s) {
        return s != null && s.matches("^[a-zA-Z|\\s]*$");
    }

    public static boolean isNumber(String s) {
        return s != null && s.matches("^[0-9|\\s]*$");
    }

    public static boolean isEmail(String s) {
        return s != null && s.matches("^[a-zA-Z|\\s|@.]*$");
    }
}

