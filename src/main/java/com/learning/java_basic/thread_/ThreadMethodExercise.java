package com.learning.java_basic.thread_;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi"+(i));
            Thread.sleep(1000);
            if(i==5){
                T3 t3 = new T3();
                Thread thread = new Thread(t3);
                thread.start();
                thread.join();
            }
        }
    }
}

class T3 implements Runnable{

    int count = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("T3运行中:"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==10){
                break;
            }
        }
    }
}
