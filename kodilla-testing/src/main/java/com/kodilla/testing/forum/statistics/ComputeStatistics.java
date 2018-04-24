package com.kodilla.testing.forum.statistics;

public class ComputeStatistics {

    private Statistics statistics;
    private double usersNumber;
    private double postsNumber;
    private double commentsNumber;
    private double userPostsAverage;
    private double userCommentsAverage;
    private double postCommentsAverage;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();
        this.userPostsAverage = this.postsNumber / this.usersNumber;
        this.userCommentsAverage = this.commentsNumber / this.usersNumber;
        this.postCommentsAverage = this.commentsNumber / this.postsNumber;
    }

    public void ShowStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average number of users post: " + userPostsAverage);
        System.out.println("Average number of users comments: " + userCommentsAverage);
        System.out.println("Average number of post comments: " + postCommentsAverage);
    }

    public double getUserNumber() {
        return usersNumber;
    }

    public double getPostsNumber() {
        return postsNumber;
    }

    public double getCommentsNumber() {
        return commentsNumber;
    }

    public double getUserPostsAverage() {
        return userPostsAverage;
    }

    public double getUserCommentsAverage() {
        return userCommentsAverage;
    }

    public double getPostCommentsAverage() {
        return postCommentsAverage;
    }
}