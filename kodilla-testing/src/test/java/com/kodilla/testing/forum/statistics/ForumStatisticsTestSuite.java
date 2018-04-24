package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test passed, is OK");
    }

    @Test
    public void testWhenTotalPostIs0() {
        //Given
        double postsNumber = 0;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn((int) postsNumber);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = (int) computestatistics.getPostsNumber();
        //Then
        Assert.assertEquals(0, quantityOfPosts);
    }

    @Test
    public void testWhenTotalPostIs1000() {
        //Given
        double postsNumber = 1000;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn((int) postsNumber);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = (int) computestatistics.getPostsNumber();
        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }

    @Test
    public void testWhenTotalCommentsIs0() {
        //Given
        double commentsNumber = 0;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn((int) commentsNumber);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfComments = (int) computestatistics.getCommentsNumber();
        //Then
        Assert.assertEquals(0, quantityOfComments);
    }

    @Test
    public void testWhenTotalCommentsIsLowerThanTotalPosts() {
        //Given
        double commentsNumber = 100;
        double postsNumber = 200;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn((int) commentsNumber);
        when(statisticsMock.postsCount()).thenReturn((int) postsNumber);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfComments = (int) computestatistics.getCommentsNumber();
        int quantityOfPosts = (int) computestatistics.getPostsNumber();
        double quantityOfPostCommentsAverage = computestatistics.getPostCommentsAverage();

        //Then
        Assert.assertTrue(quantityOfComments < quantityOfPosts);
        Assert.assertEquals(0.5, quantityOfPostCommentsAverage, 0);
    }

    @Test
    public void testWhenTotalCommentsIsBiggerThanTotalPosts() {
        //Given
        double commentsNumber = 1000;
        double postsNumber = 500;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn((int) commentsNumber);
        when(statisticsMock.postsCount()).thenReturn((int) postsNumber);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfComments = (int) computestatistics.getCommentsNumber();
        int quantityOfPosts = (int) computestatistics.getPostsNumber();
        int quantityOfPostCommentsAverage = (int) computestatistics.getPostCommentsAverage();

        //Then
        Assert.assertTrue(quantityOfComments > quantityOfPosts);
        Assert.assertEquals(2, quantityOfPostCommentsAverage);
    }

    @Test
    public void testWhenTotalUsersIs0() {
        //Given
        List<String> user = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(user);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfUsers = (int) computestatistics.getUserNumber();
        //Then
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void testWhenTotalUsersIs100() {
        //Given
        List<String> user = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            user.add("User" + i);
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(user);

        ComputeStatistics computestatistics = new ComputeStatistics();
        computestatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfUsers = (int) computestatistics.getUserNumber();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
    }
}




