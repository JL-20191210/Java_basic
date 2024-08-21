package com.learning.java_basic.collections_.designPattern.proxy_.proxy03;

public class GamePlayer implements IGamePlayer {

    private String name = "";

    //我的代理是谁
    private IGamePlayer proxy = null;

    public GamePlayer(String _name) throws Exception{
        this.name = _name;
    }

    //找到自己的代理
    @Override
    public IGamePlayer getProxy() {
         this.proxy = new GamePlayerProxy(this);
         return this.proxy;
    }

    @Override
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println("登录名为"+user+"的用户"+this.name+"登录成功");
        }else{
            System.out.println("请使用指定代理访问！");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name+"在打怪");
        }else {
            System.out.println("请使用指定代理访问！");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name+"又升级了");
        }else{
            System.out.println("请使用指定代理访问！");
        }
    }

    //校验是否是代理访问
    private boolean isProxy(){
        if(this.proxy==null){
            return false;
        }else {
            return true;
        }
    }
}
