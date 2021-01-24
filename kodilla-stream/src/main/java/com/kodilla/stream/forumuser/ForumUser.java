package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identifier;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int identifier, final String userName, final char sex,
                     final LocalDate dateOfBirth, final int numberOfPosts) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "Forum user:" +
                " identifier:" + identifier +
                ", userName:" + userName +
                ", sex:" + sex +
                ", dateOfBirth:" + dateOfBirth +
                ", numberOfPosts:" + numberOfPosts +
                ".";
    }
}
