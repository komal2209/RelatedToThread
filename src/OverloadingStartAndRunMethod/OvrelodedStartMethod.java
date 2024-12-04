package OverloadingStartAndRunMethod;

public class OvrelodedStartMethod extends Thread {

    public void start()
    {
        System.out.println("no-arg start method");
    }
    public void start(int arg)
    {
        System.out.println("int-arg start method");
    }
    public void start(char c)
    {
        System.out.println("char-arg start method");
    }

    public static void main(String[] args) {
        OvrelodedStartMethod osm= new OvrelodedStartMethod();
        // if we overloaded the start method then it will be executed just like normal method. it won't create any thread.
        osm.start();
        osm.start(10);
        osm.start('k');
    }
}
