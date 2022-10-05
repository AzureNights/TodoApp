package com.todoattemptdeux.demo.model;

public class todoModel {
    
    private String id;
    private String todoItem;
    private String due;
    private boolean done;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTodoItem() {
        return todoItem;
    }
    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }
    public String getDue() {
        return due;
    }
    public void setDue(String due) {
        this.due = due;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

    /* 
    public void todoItems (String id, String todoItem, String due){
        this.id = id;
        this.todoItem = todoItem;
        this.due = due;
    } 

    */
    




}
