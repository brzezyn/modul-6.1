package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("To buy", "eggs", 10);
            case PAINTING:
                return new PaintingTask("Picture", "black", "animal");
            case DRIVING:
                return new DrivingTask("Journey", "to parent's home", "car");
            default:
                return null;
        }
    }
}