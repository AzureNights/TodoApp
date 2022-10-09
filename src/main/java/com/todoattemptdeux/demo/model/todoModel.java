package com.todoattemptdeux.demo.model;

import java.io.Serializable;
//import java.util.UUID;

public class todoModel implements Serializable {

    //id is for uuid for redis 
    //sn serial number for each item on list 

    //private String id;
    private String sn;
    private String todoItem;
    private String due;
    private Boolean done;


    public todoModel(String sn, String todoItem, String due, Boolean done) {
        //this.id = UUID.randomUUID().toString().substring(0, 3);
        this.sn = sn;
        this.todoItem = todoItem;
        this.due = due;
        this.done = done;

    }

    /*public todoModel() {
        //random uuid up to 5 char to create the file name 
        this.id = UUID.randomUUID().toString().substring(0, 5);
    }

    */

    /*
    //public todoModel(String id) {
    //    this.id = id;
    //}

    */


    /*
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    */
    
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
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
    public Boolean isDone() {
        return done;
    }
    //or change default value to false? 
    public void setDone(Boolean done) {
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
