package com.todoattemptdeux.demo.service;

import com.todoattemptdeux.demo.model.todoModel;

public interface todoRepo {
    public void save(final todoModel tdm);
    public todoModel findbyId(final String todoId);

    
}
