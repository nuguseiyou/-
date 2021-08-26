package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 2021/8/25
 */
public class App1 {
    public static void main(String[] args) {
        JedisPool pool = App0.open("127.0.0.1", 6379);
        //从池中获得一个链接
        Jedis jedis = pool.getResource();
        jedis.set("animalsFriend", "niaonaodai");
        String animalsFriend = jedis.get("animalsFriend");
        System.out.println(animalsFriend);
        App0.close();
    }
}
