package DefineThread;
// defining thread by extending the thread class

class MyThread extends Thread {

    public void run()
    {
            System.out.println( Thread.currentThread().getName()+ " will invoke the run method.");
            System.out.println();
    }
}

class Test
{
    public static void main(String[] args)
    {
     MyThread t=new MyThread();
     t.start();
         System.out.println(Thread.currentThread().getName()+ " will execute the main method.");
        System.out.println();
    }
}

