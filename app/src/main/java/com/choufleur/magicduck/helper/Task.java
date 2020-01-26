package com.choufleur.magicduck.helper;

public class Task {
    // name
    // duration task
    // calculate breaks
    // total duration
    // priority (due date)

    String name;
    int duration; // in minutes
    int totalDuration;
    int priority;

    public Task(String name, int duration, int priority){
        this.name = name;
        this.duration = duration;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void breaks(){
        // calculate breaks and add length to duration to find total duration
    }
}
