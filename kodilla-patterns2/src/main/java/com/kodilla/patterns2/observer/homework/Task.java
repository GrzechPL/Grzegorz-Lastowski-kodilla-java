package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable{

    public  List<Observer> observers;
    public  List<String> taskList;
    public  String taskname;

    public Task(String taskname) {
        taskList = new ArrayList<>();
        observers = new ArrayList<>();
        this.taskname = taskname;
    }
    public void addTask(String task){
        taskList.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public String getTaskname() {
        return taskname;
    }
}
