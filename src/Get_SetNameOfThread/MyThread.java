package Get_SetNameOfThread;

public class MyThread extends Thread {
public void run()
{

    System.out.println("By Default Name: "+Thread.currentThread().getName());
    Thread.currentThread().setName("Child Thread");
    System.out.println("Customized Name: "+Thread.currentThread().getName());
}

    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("By Default Name: "+Thread.currentThread().getName());
         Thread.currentThread().setName("Main Thread");
        System.out.println("Customized Name: "+Thread.currentThread().getName());

        System.out.println();
        MyThread t=new MyThread();
        t.start();

    }
}
