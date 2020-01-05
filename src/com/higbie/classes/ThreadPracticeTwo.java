package com.higbie.classes;

public class ThreadPracticeTwo {

    public static void main(String[] args) {
        First first = new First();
        Second one = new Second(first, "welcome");
        Second two = new Second(first, "new");
        Second three = new Second(first, "java master");
    }
}

class First {
    synchronized void display(String msg){
        System.out.print(" [ " + msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print(" ] ");
    }
}

class Second extends Thread {
    String msg;
    First fobj;

    Second (First fp, String str){
        fobj = fp;
        msg = str;
    }
    public void run(){
        fobj.display(msg);
    }
}
