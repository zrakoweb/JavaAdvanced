package org.example;

public class GeneratorFactory {

    public String createGenerator(GeneratorType type) throws Exception {
        switch (type) {
            case DIGITS:
                return new DigitPasswordGenerator().generate().toString();
            case TEXTS:
                return new StringPasswordGenerator().generate();
            case MIX:
                return new MixPasswordGenerator().generate().toString();
            default:
                throw new Exception("No more generator implemented!");
        }
    }

    public Generator createGeneratorV2(GeneratorType type) throws Exception {
        switch (type) {
            case DIGITS:
                return new PasswordGetterService<>(new DigitPasswordGeneratorV2()).getGenerator();
            case TEXTS:
                return new PasswordGetterService<>(new StringPasswordGeneratorV2()).getGenerator();
            case MIX:
                return new PasswordGetterService<>(new MixPasswordGeneratorV2()).getGenerator();
            default:
                throw new Exception("No more generator implemented!");
        }
    }
}