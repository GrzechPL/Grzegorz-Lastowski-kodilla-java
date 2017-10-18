package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;

    boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        taskExecuted = true;
        return taskName+" "+where+" "+" "+using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
