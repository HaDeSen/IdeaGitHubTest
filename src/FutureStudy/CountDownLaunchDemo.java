package FutureStudy;

import java.util.concurrent.CountDownLatch;

public class CountDownLaunchDemo {



    public static void main(String[] args) {
        CountDownLatch cdl=new CountDownLatch(2);
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
               System.out.println(Thread.currentThread().getName()+"begin");
               cdl.countDown();
               System.out.println(Thread.currentThread().getName()+"end");
            }
        },"A");
        t1.start();


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"begin");
                cdl.countDown();
                System.out.println(Thread.currentThread().getName()+"end");
            }
        },"B");
                t2.start();
        System.out.println("ready go------------!!!");
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ready go!!!");
    }


}
