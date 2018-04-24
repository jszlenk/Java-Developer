package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeClass
    public static void saveLogger() {
        Logger.getInstance().log("login");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String login = Logger.getInstance().getLastLog();
        System.out.println("Opened: " + login);
        //Then
        Assert.assertEquals("login", login);
    }
}
