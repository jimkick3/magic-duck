package com.choufleur.magicduck.helper;

import com.beust.klaxon.Json;

public class Task {
    // name
    // duration task
    // calculate breaks
    // total duration
    // priority (due date)
    public String name;

    @Json(ignored=false)
    int duration; // in minutes

    int totalDuration;

    @Json(ignored=false)
    int priority;

    static final int DEFAULT_PRIORITY = 2;

    public Task(String name, int duration, int priority){
        this.name = name;
        this.duration = duration;
        this.priority = priority;
    }
    public Task(String name, int duration){
        this.name = name;
        this.duration = duration;
        this.priority = DEFAULT_PRIORITY;
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
