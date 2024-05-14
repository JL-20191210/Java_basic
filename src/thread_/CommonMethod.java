package thread_;

/**
 * @author felix
 * @date 2024/5/14 09:53
 */
public class CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo01 demo01 = new ThreadDemo01();
        demo01.setName("新改的线程名");
//        demo01.setPriority(Thread.MIN_PRIORITY);
        demo01.start();

        Thread.sleep(1000);
        demo01.interrupt();
    }
}

class ThreadDemo01 extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("线程："+Thread.currentThread().getName()+"在运行中"+" 优先级为"+Thread.currentThread().getPriority());
            try {
                System.out.println("线程休眠中。。。");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"休眠被打断了");
            }
        }
    }
}
