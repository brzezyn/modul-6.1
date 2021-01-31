package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //GIVEN
        User user1 = new Millenials("Aron Bean");
        User user2 = new YGeneration("Haron Sean");
        User user3 = new ZGeneration("Baron Lean");

        //WHEN
        String user1ShouldPost = user1.sharePost();
        System.out.println("User1 posting: " + user1ShouldPost);
        String user2ShouldPost = user2.sharePost();
        System.out.println("User2 posting: " + user2ShouldPost);
        String user3ShouldPost = user3.sharePost();
        System.out.println("User3 posting: " + user3ShouldPost);

        //THEN
        Assertions.assertEquals("TWITTER", user1ShouldPost);
        Assertions.assertEquals("SNAPCHAT", user2ShouldPost);
        Assertions.assertEquals("FACEBOOK", user3ShouldPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //GIVEN
        User user1 = new Millenials("Aron Bean");

        //WHEN
        String user1ShouldPost = user1.sharePost();
        System.out.println("User1 posting: " + user1ShouldPost);
        user1.setSocialPreferences(new FacebookPublisher());
        user1ShouldPost = user1.sharePost();
        System.out.println("User1 now posting: " + user1ShouldPost);

        //THEN
        Assertions.assertEquals("FACEBOOK",  user1ShouldPost);
    }
}
