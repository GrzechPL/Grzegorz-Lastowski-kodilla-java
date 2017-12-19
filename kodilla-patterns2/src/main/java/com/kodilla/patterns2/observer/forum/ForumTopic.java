package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable{

    public  List<Observer> observers;
    public  List<String> messages;
    public  String name;

    public ForumTopic(String name) {
        messages = new ArrayList<>();
        observers = new ArrayList<>();
        this.name = name;
    }
    public void addPost(String post){
        messages.add(post);
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

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
