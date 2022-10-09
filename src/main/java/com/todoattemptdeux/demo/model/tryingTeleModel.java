package com.todoattemptdeux.demo.model;

import java.io.Serializable;
import java.util.UUID;

public class tryingTeleModel implements Serializable{

    private String chat_id;
    private String userId;
    private String user;
    //username name used to log in to system ? 
    //need to link chat to user 
    //trying this out 


    //set uuid for users 
    //for redis to identify


    


    public tryingTeleModel(String chat_id, String userId, String user) {
        this.chat_id = chat_id;
        this.userId = UUID.randomUUID().toString().substring(0, 5);
        this.user = user;
    }

    
    public String getChat_id() {
        return chat_id;
    }
    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUser() {
        return user;
    }
    public void setUsername(String user) {
        this.user = user;
    }


   


    
}
