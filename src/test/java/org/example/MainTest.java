package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void testThatAlwaysFails() throws InterruptedException {
        Thread.sleep(200);
        Assertions.assertTrue(false);    }

}
//check -pr:default
