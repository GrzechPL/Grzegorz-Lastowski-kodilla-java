package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Zakupy w EuroAGD","Pralka",1);
            case PAINTINGTASK:
                return new PaintingTask("Malowaniwe pokoju","Niebieski","Sciany");
            case DRIVINGTASK:
                return new DrivingTask("Wakacje","Kreta","Samochód");
            default:
                return null;
        }

    }
}
