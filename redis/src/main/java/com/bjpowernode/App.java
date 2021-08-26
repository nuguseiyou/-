package com.bjpowernode;


import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.flushDB();
//        jedis.set("name", "JJALTOON");
//        String s = jedis.get("name");
//        System.out.println(s);
    }
}
