package org.example;

public final class MixPasswordGenerator implements PasswordGenerator<Mix> {

    @Override
    public Mix generate() {
        return new Mix();
    }
}
