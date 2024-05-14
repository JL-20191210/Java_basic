package thread_;

/**
 * @author felix
 * @date 2024/5/14 11:04
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T5 t5 = new T5();
        System.out.println("创建状态:"+t5.getState());

        t5.start();
        while(Thread.State.TERMINATED!=t5.getState()){
            Thread.sleep(1000);
            System.out.println("运行状态:"+t5.getState());
        }

        System.out.println("结束态:"+t5.getState());
    }
}

class T5 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+" 子线程运行中 状态"+Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
