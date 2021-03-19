package org.example;

public final class MixPasswordGeneratorV2 implements Generator {

    @Override
    public String generate() {
        return "(Only mix) -> " + new Mix().toString();
    }
}