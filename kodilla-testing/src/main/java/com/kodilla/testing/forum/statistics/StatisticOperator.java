package com.kodilla.testing.forum.statistics;

public class StatisticOperator {

    public ImmutableStatistics calculateAdvStatistics(Statistics statistics) {
        double avaragePostsPerUser = 0;
        double avarageCommentsPerUser = 0;
        double avarageCommentPerPost = 0;
        if (statistics.usersNames().size() != 0) {
            avaragePostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
            avarageCommentsPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        }
        if (statistics.postsCount() != 0) {
            avarageCommentPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        }

        return new ImmutableStatistics(statistics.usersNames().size(), statistics.postsCount(), statistics.commentsCount(), avaragePostsPerUser, avarageCommentsPerUser, avarageCommentPerPost);
    }

    public void showStatistics() {
        System.out.println(toString());
    }
}
