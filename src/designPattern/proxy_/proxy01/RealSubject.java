package designPattern.proxy_.proxy01;

public class RealSubject implements Subject {
    @Override
    public void request() {
        //业务逻辑
        System.out.println("我是状元郎，我知道你的事了");
    }
}
