package com.example.visitorcounterapp.model;

public class Visit {

    private String userName;
    private int count;

    public Visit(String userName, int count) {
        this.userName = userName;
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "userName='" + userName + '\'' +
                ", count=" + count +
                '}';
    }
}
