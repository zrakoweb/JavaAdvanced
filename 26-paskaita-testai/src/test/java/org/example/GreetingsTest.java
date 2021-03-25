package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    @Test
    public void test1 (){
        Greeting greeting = new Greeting();
        assertEquals("Hello Bob", greeting.greet("Bob"));
    }

    @Test
    public void test2 (){
        Greeting greeting = new Greeting();
        assertEquals("Hello Rob", greeting.greet("Rob"));
    }

    @Test
    public void test3 (){
        Greeting greeting = new Greeting();
        assertEquals("Hello my friend", greeting.greet(null));
    }

    @Test
    public void test4 (){
        Greeting greeting = new Greeting();
        assertEquals("HELLO JERRY!", greeting.greet("JERRY"));
    }


}
