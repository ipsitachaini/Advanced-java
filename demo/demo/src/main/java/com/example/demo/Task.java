package com.example.demo;

public class Task {

    private int taskId;
    private String title;
    private String status;

    public Task(){}

    public Task(int taskId, String title, String status){
        this.taskId = taskId;
        this.title = title;
        this.status = status;
    }

    public int getTaskId(){
        return taskId;
    }

    public void setTaskId(int taskId){
        this.taskId = taskId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}