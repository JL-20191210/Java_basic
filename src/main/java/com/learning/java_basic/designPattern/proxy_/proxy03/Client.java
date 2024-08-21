package com.learning.java_basic.collections_.designPattern.proxy_.proxy03;

//强制代理
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("===正常方式===");
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始打游戏");
        proxy.login("张三","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("打完了");

        System.out.println("===直接访问真实角色===");
        IGamePlayer proxy1 = new GamePlayer("张三");
        System.out.println("开始打游戏");
        proxy1.login("张三","password");
        proxy1.killBoss();
        proxy1.upgrade();
        System.out.println("打完了");

        System.out.println("===直接访问代理类===");
        IGamePlayer player1 = new GamePlayer("张三");
        GamePlayerProxy proxy2 = new GamePlayerProxy(player1);
        System.out.println("开始打游戏");
        proxy2.login("张三","password");
        proxy2.killBoss();
        proxy2.upgrade();
        System.out.println("打完了");
    }
}
