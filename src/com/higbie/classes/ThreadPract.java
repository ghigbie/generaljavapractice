package com.higbie.classes;

public class ThreadPract {

    public static void main(String [] args) {

        MyThread mt = new MyThread("Child #1");
        Thread newThread = new Thread(mt);
        newThread.start();
    }

}

class MyThread implements Runnable{

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
    }

    public MyThread(String myThread){
        this.myThread = myThread;
    }
}
