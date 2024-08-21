package com.learning.java_basic.collections_.designPattern.proxy_.proxy02;

//普通代理
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println("开始打游戏");
        proxy.login("张三","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("打完了");
    }
}
