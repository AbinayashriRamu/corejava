package com.chainsys.threads;

public class MultiThreadsOnJoin {
    
    public static void main(String[]args) {
        //multiThreadsonjoin();
        runningMultipleRunnableThreads();
    }
    
    public static void multiThreadsonjoin()
    {
        try
          {
            Thread t=Thread.currentThread();
            System.out.println("MainTh ID: " +t.getId() );
            RunnableWorker firstWorker=new RunnableWorker();
            Thread t1=new Thread(firstWorker);
            Thread t2=new Thread(firstWorker);
            t1.start();//call run
            t2.start();// call run        
            //t1.join();        // its wait until the t1. and t2 threads works finish 
            //t2.join();
            System.out.println("From Main--END!!!");
         }catch(Exception e)
         {
             System.out.println("ERROR!!! "+e.getMessage());
         }
    }
    public static void runningMultipleRunnableThreads()
    {
        try
          {
            Thread t=Thread.currentThread();
            System.out.println("MainTh ID: " +t.getId() );
            RunnableWorker firstWorker=new RunnableWorker();
            //RunnableWorker secondWorker=new RunnableWorker();
            Thread t1=new Thread(firstWorker);
            //Thread t2=new Thread(secondWorker);
            Thread t2=new Thread(firstWorker);
            t1.start();//call run
            t2.start();//call run
            System.out.println("From Main--END!!!");
         }
        catch(Exception e)
         {
             System.out.println("ERROR!!! "+e.getMessage());
         }
    }
}