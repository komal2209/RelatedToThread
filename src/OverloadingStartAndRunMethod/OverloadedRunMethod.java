package OverloadingStartAndRunMethod;

public class OverloadedRunMethod extends Thread {
    public void run()
    {
        System.out.println("no-arg run method");
    }
    public void run(int arg)
    {
        System.out.println("int-arg run method");
    }
    public void run(char c)
    {
        System.out.println("char-arg run method");
    }

    public static void main(String[] args)
    {
        OverloadedRunMethod orm=new OverloadedRunMethod();
        //thread class start() can invoke the no-argument run method and the rest of the run method we can call just like normal method call.
        orm.start();
       // orm.run(10);
      //  orm.run('k');

    }
}
