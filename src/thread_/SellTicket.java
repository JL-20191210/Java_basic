package thread_;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        //会出现超卖
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        System.out.println("===使用接口方式售票===");
        SellTicket02 sellTicket021 = new SellTicket02();
        new Thread(sellTicket021).start();
        new Thread(sellTicket021).start();
        new Thread(sellTicket021).start();
    }
}



//使用thread方式
class SellTicket01 extends Thread{
    private static int ticketNum=100;//让多个线程共享ticketNum
    @Override
    public void run() {
        while (true){
            if(ticketNum<=0){
                System.out.println("售票结束。。。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"+" 剩余票数="+(--ticketNum));
        }
    }
}

//使用接口方式
class SellTicket02 implements Runnable{

    private int ticketNum=100;
    @Override
    public void run() {
        while (true){
            if(ticketNum<=0){
                System.out.println("售票结束。。。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"+" 剩余票数="+(--ticketNum));
        }
    }
}