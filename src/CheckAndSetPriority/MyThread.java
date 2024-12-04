package CheckAndSetPriority;

/* if we set the priority of thread beyond the range(1 to 10 where 1 is minimum ,5 is norm and 10 is max priority)
 then we will get the runtime error : IllegalArgumentException.*/

public class MyThread extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getName() +" has by default priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName() +" has customized priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Thread.currentThread().getName() +" has by default priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getName() +" has customized priority : "+ Thread.currentThread().getPriority());
        System.out.println();
        MyThread t=new MyThread();
        t.start();

      //  t.setPriority(15); //runtime error : IllegalArgumentException.

    }
}
