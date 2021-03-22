package uzduotis4;

import java.util.function.Function;

public class InjectableTranslator implements Function<String, String> {

    @Override
    public String apply(String s) {
        return Translator.toLocale(s);
    }
}
