package thread_;

/**
 * @author felix
 * @date 2024/5/14 10:50
 *
 * 守护线程
 *
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        MyDaemon myDaemon = new MyDaemon();
        //守护线程：当所有线程结束后，守护线程自动结束
        myDaemon.setDaemon(true);
        myDaemon.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" 主线程运行中");
            Thread.sleep(1000);
        }
    }
}

class MyDaemon extends Thread{
    @Override
    public void run() {
        for (;;){
            System.out.println(Thread.currentThread().getName()+" 守护线程运行中");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
