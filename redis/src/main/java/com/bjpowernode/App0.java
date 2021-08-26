package com.bjpowernode;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.security.PrivateKey;

public class App0 {
    //定义连接池
    private static JedisPool pool = null;
    //创建连接池的方法
    public static JedisPool open(String host,int port){
        if(pool == null){
            JedisPoolConfig config = new JedisPoolConfig();
            //最大连接数
            config.setMaxTotal(10);
            //最大空闲连接数
            config.setMaxIdle(3);
            pool = new JedisPool(config,host,port);
        }
        return pool;
    }
    //关闭连接池
    public static void close(){
        if(pool!=null){
            pool.close();
        }
    }
}
