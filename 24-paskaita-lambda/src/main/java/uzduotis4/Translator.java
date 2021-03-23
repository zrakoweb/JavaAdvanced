package uzduotis4;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private final static Map<String, String> translations = new HashMap<>();

    public static String toLocale(String key){

        translations.put("hello", "Welcome to our app");
        translations.put("entry_added", "Entry has been added");
        translations.put("logout", "Logout");
        return translations.get(key);
    }

}
