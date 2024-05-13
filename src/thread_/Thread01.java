package thread_;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException{
        Cat cat = new Cat();
        cat.start();

        System.out.println("主线程继续执行"+Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i="+i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread{
    int times = 0;

    @Override
    public void run() {//重写run方法，写上自己的业务逻辑

        while(true){
            System.out.println("喵喵，我是小猫咪"+(++times) +" 线程名="+Thread.currentThread().getName());

            //线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(times==80){
                break;//线程退出
            }
        }
    }
}
