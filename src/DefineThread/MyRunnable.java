package DefineThread;

public class MyRunnable implements Runnable {
    public void run()
    {
        System.out.println();
        System.out.println( Thread.currentThread().getName()+ " will invoke the run method.");
    }
}

class TestRunnable
{
    public static void main(String[] args)
    {
        MyRunnable myrun=new MyRunnable();
        Thread thr= new Thread(myrun);
        thr.start();
        //special case study.

      /*  thr.start();//A new thread will be created & and register thr thread with thread scheduler and perform the all other mandatory activities & then child thread is responsible  to invoke  run  of the MyRunnable class.
        thr.run();//No new thread will be created simple call the  run method of MyRunnable class. it is just like normal run method calling from thread class.

        Thread t1=new Thread();
        t1.start(); //A new thread will be created & and register thr thread with thread scheduler and perform the all other mandatory activities & then child thread is responsible  to invoke  run  of the thread class.
        t1.run(); //No new thread will be created simple call the run method of thread class.it is just like normal run method calling from thread class.

*/
        System.out.println();
        System.out.println(Thread.currentThread().getName()+ " will execute the main method.");




    }
}
