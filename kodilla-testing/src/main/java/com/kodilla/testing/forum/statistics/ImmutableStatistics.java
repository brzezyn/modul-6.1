package com.kodilla.testing.forum.statistics;

public class ImmutableStatistics {

    int amountOfUsers;
    int amountOfPosts;
    int amountOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

public int getAmountOfUsers() {
        return amountOfUsers;
        }

public int getAmountOfPosts() {
        return amountOfPosts;
        }

public int getAmountOfComments() {
        return amountOfComments;
        }

public double getAveragePostsPerUser() {
        return averagePostsPerUser;
        }

public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
        }

public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
        }
    ImmutableStatistics(int amountOfUsers, int amountOfPosts, int amountOfComments, double averagePostsPerUser, double averageCommentsPerUser, double averageCommentsPerPost) {
        this.amountOfUsers = amountOfUsers;
        this.amountOfPosts = amountOfPosts;
        this.amountOfComments = amountOfComments;
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }
}