package com.example.testlab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    HelloController helloController = new HelloController();

    @Test
    void hello() {
        String name = "Jamie";
        assertEquals("Hello " + name, helloController.hello(name));
    }

    @Test
    void reverseString() {
        String input = "1795 Hello! Let's Count to 1, 2, 3...";
        assertEquals("...3 ,2 ,1 ot tnuoC s'teL !olleH 5971", helloController.reverseString(input));
    }
}