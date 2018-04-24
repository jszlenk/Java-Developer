package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames();
    int postsCount();
    int commentsCount();
}