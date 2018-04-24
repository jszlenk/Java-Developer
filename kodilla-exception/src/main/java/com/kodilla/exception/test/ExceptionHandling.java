package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge fileProbably = new SecondChallenge();
        try {
            String done = fileProbably.probablyIWillThrowException(6, 1);
            System.out.println(done);
        } catch (Exception e) {
            System.out.println("Error " + e);
        } finally {
            System.out.println("Finally");
        }
    }
}