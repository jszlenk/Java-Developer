package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char gender;
    private final LocalDate dateofbirth;
    private final int quantitypost;

    public ForumUser(final int id, final String username, final char gender, final LocalDate dateofbirth, final int quantitypost) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.quantitypost = quantitypost;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateofbirth;
    }

    public int getQuantitypost() {
        return quantitypost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateofbirth=" + dateofbirth +
                ", quantitypost=" + quantitypost +
                '}';
    }
}
