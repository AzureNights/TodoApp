package com.todoattemptdeux.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class todoRedis {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    
    
}
