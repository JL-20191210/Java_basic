package thread_;

/**
 * @author felix
 * @date 2024/5/14 09:21
 * 线程终止 通知方式
 */
public class Terminate {
    public static void main(String[] args) throws InterruptedException {
        AThread aThread = new AThread();
        new Thread(aThread).start();

        Thread.sleep(5000);

        aThread.setLoop(false);
    }
}

class AThread implements Runnable{

    boolean loop = true;
    @Override
    public void run() {
        while (loop){
            System.out.println("我在工作Athread。。。");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
