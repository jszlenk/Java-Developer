package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int numberOfQuestion;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(QueueOfTopics queueOfTopics) {
        System.out.println(mentorName + ": New question in queue " + queueOfTopics.getName() + "\n" + " ( total: " + queueOfTopics.getQuestions().size() + " questions)");
        numberOfQuestion++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return numberOfQuestion;
    }
}
