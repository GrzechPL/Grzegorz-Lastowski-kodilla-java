package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Zakupy w EuroAGD","pralka",1);
            case PAINTINGTASK:
                return new PaintingTask("Malowaniwe","niebieski","sciany");
            case DRIVINGTASK:
                return new DrivingTask("Wakacje","kreta","samochód");
            default:
                return null;
        }

    }
}
