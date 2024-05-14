package thread_;


/**
 * 1. 同步实例方法
 * 2. 同步代码快
 * 3. 同步静态方法
 * 4. 同步指定对象
 */
public class Syn {
    public static void main(String[] args) {
//        System.out.println("===同步实例方法===");
//        SellTicket03 sellTicket03 = new SellTicket03();
//        new Thread(sellTicket03).start();
//        new Thread(sellTicket03).start();
//        new Thread(sellTicket03).start();

//        System.out.println("===同步代码===");
//        SellTicket04 sellTicket04 = new SellTicket04();
//        new Thread(sellTicket04).start();
//        new Thread(sellTicket04).start();
//        new Thread(sellTicket04).start();

        System.out.println("===同步对象===");
        SellTicket05 sellTicket05 = new SellTicket05();
        SellTicket05 sellTicket051 = new SellTicket05();
        SellTicket05 sellTicket052 = new SellTicket05();
        sellTicket05.start();
        sellTicket051.start();
        sellTicket052.start();
    }
}


//接口实现方方式
class SellTicket03 implements Runnable{

    private int ticketNum=100;

    private boolean loop = true;

    //同步实例方法，同一时刻仅允许一个线程进入
    public synchronized void sell(){
        if(ticketNum<=0){
            System.out.println("售票结束。。。");
            loop = false;
            return;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"+" 剩余票数="+(--ticketNum));

    }
    @Override
    public void run() {
        while (loop){
            sell();
        }
    }
}

//接口实现方方式
class SellTicket04 implements Runnable{

    private int ticketNum=100;

    @Override
    public void run() {
        System.out.println("线程 "+ Thread.currentThread().getName()+" 投入运行");
        while (true){
            //同步代码块
            synchronized(this){
                if(ticketNum<=0){
                    System.out.println("线程 "+Thread.currentThread().getName()+"售票结束。。。");
                    break;
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"+" 剩余票数="+(--ticketNum));
            }
        }
    }
}

//接口实现方方式
class SellTicket05 extends Thread{

    private static int ticketNum=100;

    private static final Object obj = new Object(); // 创建一个对象作为同步锁

    @Override
    public void run() {
        System.out.println("线程 "+ Thread.currentThread().getName()+" 投入运行");
        while (true){
            synchronized(obj){
                if(ticketNum<=0){
                    System.out.println("当前值为："+ticketNum);
                    System.out.println("线程 "+Thread.currentThread().getName()+"售票结束。。。");
                    break;
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"+" 剩余票数="+getTicketNum());
                ticketNum--;
            }
        }
    }

    public static int getTicketNum() { // 提供一个公共方法来获取剩余票数
        synchronized (obj) {
            return ticketNum;
        }
    }
}