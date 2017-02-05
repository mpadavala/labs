package com.labs.threads.join;

import java.util.Random;

public class MyThreadJoins {
 
    public static void main(String[] args) {
    	
    	System.out.println("Main Thread started : " + Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
    	
    	Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
         
        t1.start();
         
        //start second thread after waiting for 2 seconds or if it's dead
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        t2.start();
         
        //start third thread only when first thread is dead
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        t3.start();
         
        //let all threads finish execution before finishing main thread
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        System.out.println("All threads are dead, exiting main thread : " + Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
    }
 
}
 

	class MyRunnable implements Runnable{
 
    @Override
    public void run() {
        System.out.println("Thread (" + Thread.currentThread().getName()  +") started : " +  Thread.currentThread().getId());
        try {
        	 Random randomGenerator = new Random();
        	 int randomNumber =  4000 + randomGenerator.nextInt(10000);
        	 System.out.println("Thread (" + Thread.currentThread().getName()  +") sleep time : "  + randomNumber);
        	 Thread.sleep(randomNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName() + " : " +  Thread.currentThread().getId());
    }
     
}

