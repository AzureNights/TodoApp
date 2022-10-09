package com.todoattemptdeux.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


import com.todoattemptdeux.demo.model.todoModel;

@Component
public class todoRedisDatabase implements todoRepo {
    
    @Autowired
    RedisTemplate<String, Object> template;

    //check need to redo 
    //need to dfferentiate based on user 
    //rather than the id. cuz id was set to individual to do item 

    @Override
    public void save(todoModel tdm) {
        template.opsForValue().set(tdm.getDue(), tdm);
        //if (null == value)

        //need to change to tryingTelemodel - bbased on users rather than each individual id 
        //qhich is what is happening now 
            

    }

    @Override
    public todoModel findbyId (String todoId) {
        todoModel result = (todoModel) template.opsForValue().get(todoId);
        return result;
    }

    



  

    
    
}
