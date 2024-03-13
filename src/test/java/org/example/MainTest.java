package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void testThatAlwaysFails() throws InterruptedException {
        Thread.sleep(120000);
        Assertions.assertTrue(false);    }

}