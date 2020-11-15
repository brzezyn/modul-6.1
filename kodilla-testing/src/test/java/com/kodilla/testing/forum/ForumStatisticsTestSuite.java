package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.StatisticOperator;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Tests Begin:");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests ends");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test case begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case end");
    }

    @Test
    public void testZeroPost() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(0);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);
        operator.showStatistics();
    }

    @Test
    public void testPostsThousand() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(1000, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(1000 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(20 / 1000d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);
        operator.showStatistics();
    }

    @Test
    public void testCommentsZero() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(10);
        when(statsMock.commentsCount()).thenReturn(0);
        operator.calculateAdvStatistics(statsMock);
        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(10, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(10 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(0 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(0 / 10d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);
        operator.showStatistics();
    }

    @Test
    public void testMoreCommentsThenPosts() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(20);
        when(statsMock.commentsCount()).thenReturn(200);
        operator.calculateAdvStatistics(statsMock);
        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(200, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(200 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(200 / 20d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);
        operator.showStatistics();
    }

    @Test
    public void testMorePostsThenComments() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(30);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(30, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(30 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(20 / 30d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);
        operator.showStatistics();
    }

    @Test
    public void testUsersZero() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(101);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(101, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(20 / 101d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);
        operator.showStatistics();
    }

    @Test
    public void testUsersHundred() {
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User " + i);
        }
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(50);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);

        Assertions.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assertions.assertEquals(50, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assertions.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assertions.assertEquals(50 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(), 1);
        Assertions.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(), 1);
        Assertions.assertEquals(20 / 50d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(), 1);

        operator.showStatistics();
    }
}