package org.example;

public interface PasswordGeneratorV2<T extends Generator> {

    T getGenerator();

    String getPassword();
}
