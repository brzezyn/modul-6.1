package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(036, "amaZama", 'F', LocalDate.of(1995, 1, 7), 4));
        theForumUserList.add(new ForumUser(027, "Coooooe", 'M', LocalDate.of(2001, 2, 5), 10));
        theForumUserList.add(new ForumUser(066, "Surrym", 'M', LocalDate.of(1995, 5, 2), 0));
        theForumUserList.add(new ForumUser(024, "worker", 'M', LocalDate.of(1999, 12, 4), 7));
        theForumUserList.add(new ForumUser(015, "theTroll", 'M', LocalDate.of(1998, 11, 8), 17));
        theForumUserList.add(new ForumUser(073, "nelayla", 'F', LocalDate.of(1992, 12, 16), 0));

    }

    public final List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
