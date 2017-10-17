package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    String taskName;
    String color;
    String whatToPaint;

    boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        taskExecuted = true;
        return taskName+" "+whatToPaint+" "+color;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        taskExecuted = false;
        return taskExecuted;
    }
}
