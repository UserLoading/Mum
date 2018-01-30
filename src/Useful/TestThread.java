/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

/**
 *
 * @author LG171811
 */

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   private int min =5;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int sec = 0 ; min >-1;sec--) {
            //System.out.println("Thread: " + threadName + ", " + i);
            System.out.println(threadName+"  "+min+"m"+sec+"s");
            System.out.println();
            if (sec ==0){
                min--;
                sec=60;
            }
           Thread.sleep(1000);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {

         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class TestThread {

   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
   }   
}
