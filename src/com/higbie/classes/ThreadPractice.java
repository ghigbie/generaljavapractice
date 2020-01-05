package com.higbie.classes;

public class ThreadPractice {

    public static void main(String [] args) {


        MyThread mt = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        MyThread mt4 = new MyThread("Child #4");

//        Thread newThread = new Thread(mt);
//        newThread.start();

//        for (int i = 0; i < 50; i++){
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.print("Main thread was interrupted.");
//                e.printStackTrace();
//            }
//        }

//        try {
//            mt.thread.join();
//            System.out.println("Child #1 joined");
//            mt2.thread.join();
//            System.out.println("Child #2 joined");
//            mt3.thread.join();
//            System.out.println("Child #3 joined");
//            mt4.thread.join();
//            System.out.println("Child #4 joined");
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            mt.thread.setPriority(Thread.NORM_PRIORITY);
            System.out.println("Child #1 Priority is " + mt.thread.getPriority());
            mt2.thread.setPriority(Thread.MIN_PRIORITY);
            System.out.println("Child #2 Priority is " + mt.thread.getPriority());
            mt3.thread.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Child #3 Priority is " + mt.thread.getPriority());
        }catch(Exception e){
             e.printStackTrace();
        }

//        do{
//            System.out.println(".");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.print("Main thread was interrupted.");
//                e.printStackTrace();
//            }
//        }while(mt.thread.isAlive() || mt2.thread.isAlive() || mt3.thread.isAlive() || mt4.thread.isAlive());
    }

}

class MyThread implements Runnable{

    Thread thread;
    String myThread;

    @Override
    public void run() {
        System.out.println("Starting " + myThread);
        for(int count = 0; count < 10; count++){
            try{
                Thread.sleep(400);
                System.out.println("In " + myThread + " count is" + count);
            }catch (InterruptedException e){
                System.out.println(myThread + " was interrupted!");
                e.printStackTrace();
            }
            System.out.println(myThread + " was terminated : (");
        }
        System.out.println("Main thread ending.");
    }

    public MyThread(String myThread){
        thread = new Thread(this, myThread);
        thread.start();
        this.myThread = myThread;
    }
}
