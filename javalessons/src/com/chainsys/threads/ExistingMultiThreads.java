package com.chainsys.threads;

public class ExistingMultiThreads {

public static void main(String[] args) {
    exitingMultiThreads();
    }
public static void exitingMultiThreads()
{
    try{
        RunnableWorker obj=new RunnableWorker();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();//call run
        t2.start();// call run
        t1.join(400);
        t2.join(200);
        System.out.println("From Main AMT: " + obj.amount);
        }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
        }
    finally
    {
    System.out.println("Inside Finally");
    Runtime rt=Runtime.getRuntime(); 
    rt.exit(0);
    }
}
}