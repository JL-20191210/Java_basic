package thread_;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Thread thread = new Thread(dog);
        thread.start();

        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal{
}

class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫。。。");
    }
}

//线程代理类，模拟了一个极简的Tread类
class ThreadProxy implements Runnable{

    private Runnable target = null;
    @Override
    public void run() {
        if(target!=null){
            target.run();//动态绑定 （运行类型Tiger）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }

    public void start0(){
        run();
    }
}

class Dog implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("狗叫。。。hi+"+(++count)+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(count==10) break;
        }
    }
}
