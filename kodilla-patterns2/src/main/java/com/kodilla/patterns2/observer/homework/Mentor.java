package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String nickname;
    private final String name;
    private int updateCount;

    public Mentor(String nickname, String name) {
        this.nickname = nickname;
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println(nickname+" "+name+" :new task from :"+task.getTaskname()+"\n"+"(total: "+task.getTaskList().size()+"tasks)");
        updateCount++;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
