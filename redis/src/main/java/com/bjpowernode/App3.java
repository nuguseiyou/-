package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

import java.util.List;

public class App3 {
    public static void main(String[] args) {
        JedisPool pool = App0.open("127.0.0.1", 6379);
        Jedis jedis = pool.getResource();
        Transaction multi = jedis.multi();
        multi.set("shiwu", "13");
        multi.append("shiwu", "12");
        List<Object> exec = multi.exec();
        for (Object o : exec) {
            System.out.println(o);
        }
    }
}
