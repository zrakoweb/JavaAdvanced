package org.example;

public class Greeting {
    private final static String PASISVEIKINIMAS = "Hello";

    public String greet(String value) {
        if (value != null) {
            if(value.equals(value.toUpperCase())){
                return PASISVEIKINIMAS.toUpperCase() +" "+ value + "!";
            }

        } else return  PASISVEIKINIMAS + " my friend";

        return PASISVEIKINIMAS + " " + value;
    }
}
