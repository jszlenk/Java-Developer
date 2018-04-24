package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double adding = calculator.add(3, 6);
        double subtraction = calculator.sub(12, 6);
        double multiplication = calculator.mul(3, 3);
        double division = calculator.div(15, 5);
        //Then
        Assert.assertEquals(9, adding, 0);
        Assert.assertEquals(6, subtraction, 0);
        Assert.assertEquals(9, multiplication, 0);
        Assert.assertEquals(3, division, 0);
    }
}