package com.learning.java_basic.collections_.designPattern.proxy_.proxy01;

public class Proxy implements Subject{

    //要代理哪个实现类
    private Subject subject = null;

    public Proxy() {
        this.subject = new RealSubject();
    }

    //通过构造函数传递代理者
    public Proxy(Object ...objects) {
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    public void before(){
        //预处理
        System.out.println("预处理");
        System.out.println("我是书童，我去给你找主子");
    }

    public void after(){
        //善后处理
        System.out.println("善后处理");
    }
}
