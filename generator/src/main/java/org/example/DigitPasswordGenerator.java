package org.example;

import java.math.BigInteger;

public final class DigitPasswordGenerator implements PasswordGenerator<BigInteger> {

    @Override
    public BigInteger generate() {
        return new BigInteger("123456789012");
    }
}
