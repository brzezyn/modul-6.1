package com.kodilla.testing.forum.statistics;

public class StatisticOperator {

    public StatisticsProcessor calculateAdvStatistics(Statistics statistics) {
        double averagePostsPerUser = 0;
        double averageCommentsPerUser = 0;
        double averageCommentsPerPost = 0;
        if (statistics.usersNames().size() != 0) {
            averagePostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
            averageCommentsPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        }

        return new StatisticsProcessor(statistics.usersNames().size(),statistics.postsCount(),statistics.commentsCount(),averagePostsPerUser,averageCommentsPerUser,averageCommentsPerPost);
    }

    public void showStatistics() {
        System.out.println(toString());
    }
}

