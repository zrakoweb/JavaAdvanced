package org.example;

public final class StringPasswordGenerator implements PasswordGenerator<String> {

    @Override
    public String generate() {
        return "abSdeGghij";
    }
}