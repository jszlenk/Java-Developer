package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "dylan",
                'M', LocalDate.of(1976, 12, 31), 5));
        theUserList.add(new ForumUser(2, "dreams",
                'M', LocalDate.of(1986, 2, 1), 0));
        theUserList.add(new ForumUser(3, "heaven",
                'K', LocalDate.of(1992, 8, 31), 4));
        theUserList.add(new ForumUser(4, "night",
                'M', LocalDate.of(1996, 6, 30), 2));
        theUserList.add(new ForumUser(5, "kings",
                'K', LocalDate.of(1999, 3, 31), 35));
        theUserList.add(new ForumUser(6, "duty",
                'M', LocalDate.of(1998, 7, 31), 25));
        theUserList.add(new ForumUser(7, "eternity",
                'M', LocalDate.of(1981, 10, 31), 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
