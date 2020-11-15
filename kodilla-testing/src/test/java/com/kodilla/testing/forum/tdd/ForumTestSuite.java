package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of the tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        //When
        forumUser.addPost("mrsmith", "Hello everybody this is my first contribution here");
        //Then
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribution here", "mrsmith");
        //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words :D");
        //Then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribute here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //Then
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assertions.assertEquals(thePost, retrievedPost);
    }
    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribute here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assertions.assertEquals(theComment, retrievedComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribute here!", "mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assertions.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribute here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assertions.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribute here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jhon Smith");
        ForumPost thePost = new ForumPost("Hello everybody," +
                "this is my first contribute here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }
}