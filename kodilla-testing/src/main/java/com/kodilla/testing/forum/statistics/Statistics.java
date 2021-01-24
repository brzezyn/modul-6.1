package com.kodilla.testing.forum.statistics;

import java.util.Collection;
import java.util.List;

public interface Statistics {

    List<String> usersNames(); //list of user names

    int postsCount();        //total number of forum posts

    int commentsCount();      //total number of comments

}
