package thread_;

/**
 * @author felix
 * @date 2024/5/14 10:11
 */
public class Preemptive {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        //使用前交替占用CPU，使用后t独享CPU，线程结束后释放CPU
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" 被抢CPU");

            Thread.sleep(1000);
        }
    }
}

class T extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" 抢占CPU");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
