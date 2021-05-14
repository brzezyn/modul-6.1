package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    void testUpdate() {
        //Given
        StudentOneHomeworkQueue studentOneHomeworkQueue = new StudentOneHomeworkQueue();
        StudentTwoHomeworkQueue studentTwoHomeworkQueue = new StudentTwoHomeworkQueue();
        StudentThreeHomeworkQueue studentThreeHomeworkQueue = new StudentThreeHomeworkQueue();

        Mentor mentorA = new Mentor("Mentor A");
        Mentor mentorB = new Mentor("Mentor B");

        studentOneHomeworkQueue.registerObserver(mentorA);
        studentTwoHomeworkQueue.registerObserver(mentorA);

        studentThreeHomeworkQueue.registerObserver(mentorB);

        studentOneHomeworkQueue.addHomework("Homework1");
        studentOneHomeworkQueue.addHomework("Homework2");
        studentOneHomeworkQueue.addHomework("Homework3");

        studentTwoHomeworkQueue.addHomework("Homework1");
        studentTwoHomeworkQueue.addHomework("Homework2");

        studentThreeHomeworkQueue.addHomework("Homework1");

        //When
        int mentorANotifies = mentorA.getUpdateCount();
        int mentorBNotifies = mentorB.getUpdateCount();

        //Then
        assertEquals(5, mentorANotifies);
        assertEquals(1, mentorBNotifies);
    }

}
