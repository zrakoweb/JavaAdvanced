package org.example;

public final class PasswordGetterService<T extends Generator> implements PasswordGeneratorV2<T> {

    private final T generator;

    public PasswordGetterService(T t) {
        super();
        this.generator = t;
    }

    @Override
    public T getGenerator() {
        return generator;
    }

    @Override
    public String getPassword() {
        return generator.generate();
    }
}