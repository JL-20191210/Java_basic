package thread_;

/**
 * @author felix
 * @date 2024/5/14 10:22
 */
public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        Thread thread = new Thread(t4);
        thread.setName("子线程 Thread-0");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            Thread.currentThread().setName("主线程 main");
            System.out.println(Thread.currentThread().getName()+" 进入CPU"+i+"次");

            if(i==5){
                thread.start();
                thread.join();
            }
        }
    }
}

class T4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" 进入CPU"+i+"次");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
