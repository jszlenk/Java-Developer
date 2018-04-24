package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: CollectionTestSuite begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: CollectionTestSuite end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = emptyList.exterminate(numbers2);
        System.out.println("ArrayList is empty. Testing: " + result);
        //Then
        Assert.assertEquals(result.isEmpty(), true);
        Assert.assertTrue(result.size() < 1);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator evenoddList = new OddNumbersExterminator();
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.add(5);
        numbers3.add(6);
        ArrayList<Integer> numbers4 = new ArrayList<Integer>();
        numbers4.add(6);
        //When
        ArrayList<Integer> result = evenoddList.exterminate(numbers3);
        System.out.println("ArrayList has 1 even element. Testing: " + result.size() + ", it is: " + result);
        //Then
        Assert.assertEquals(numbers4, result);
        Assert.assertTrue(result.size() == 1);
    }
}
