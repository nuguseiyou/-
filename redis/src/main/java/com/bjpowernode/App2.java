package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
       JedisPool pool = App0.open("127.0.0.1", 6379);
        Jedis jedis = pool.getResource();
        jedis.hset("JJALTOON1", "animalsFriend", "dangdang");
        String hget = jedis.hget("JJALTOON1", "animalsFriend");
        System.out.println(hget);


        HashMap map = new HashMap();
        map.put("friend1", "dangdang");
        map.put("friend2", "niaonaodai");
        map.put("friend3", "xibaquan");
        jedis.hmset("JJALTOON",map);
        List<String> hmget = jedis.hmget("JJALTOON", "friend1", "friend2", "friend3");
        for (String s : hmget) {
            System.out.println(s);
        }

    }
}
