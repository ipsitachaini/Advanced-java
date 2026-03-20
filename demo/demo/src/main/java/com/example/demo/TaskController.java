package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    public TaskController(){

        tasks.add(new Task(1,"Complete Spring Boot project","Pending"));
        tasks.add(new Task(2,"Study Hibernate","completed"));
        tasks.add(new Task(3,"Prepare for interview","Pending"));
        tasks.add(new Task(4,"Go for a walk","in_progress"));
        tasks.add(new Task(5,"Read a book","completed"));
        tasks.add(new Task(6,"Cook dinner","in_progress"));
    }
    
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return tasks;
    }
    
    @GetMapping("/tasks/{id}")
    public Task getTasks(@PathVariable int id){

        for(Task t : tasks){
            if(t.getTaskId() == id){
                return t;
            }
        }

        return null;
    }
   
   @GetMapping("/status/{status}")
   public List<Task> getTaskByStatus(@PathVariable String status){

    List<Task> result = new ArrayList<>();

    for(Task t : tasks){
        if(t.getStatus().equalsIgnoreCase(status)){
            result.add(t);
        }
    }

    return result;
}

}