package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testQueueUpdate() {
        //Given
        QueueOfTopics javaHelpQueueOfTopics = new JavaHelpQueueOfTopics();
        Mentor adrianSmith = new Mentor("Adrian Smith");
        Mentor alCapone = new Mentor("Al Capone");
        javaHelpQueueOfTopics.registerObserver(adrianSmith);
        javaHelpQueueOfTopics.registerObserver(alCapone);
        //When
        javaHelpQueueOfTopics.addQuestion("Hi, how can i use JavaDoc?");
        javaHelpQueueOfTopics.addQuestion("Help, my SQL db doesn't want to work");
        javaHelpQueueOfTopics.removeObserver(alCapone);
        javaHelpQueueOfTopics.addQuestion("Why Tomcat doesn't work?");
        //Then
        assertEquals(3, adrianSmith.getUpdateCount());
        assertEquals(2, alCapone.getUpdateCount());
    }
}
