package objectOrientedProgramming;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you" + this.getName());
    }
}
public class threadPriorities {
    public static void main(String[] args) {
        // Ready queue : t1 t2 t3 t4 t5
        MyThr1 t1 = new MyThr1("Adarsh1");
        MyThr1 t2 = new MyThr1("Adarsh2");
        MyThr1 t3 = new MyThr1("Adarsh3");
        MyThr1 t4 = new MyThr1("Adarsh4");
        MyThr1 t5 = new MyThr1("Adarsh5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority((Thread.MIN_PRIORITY));
        t3.setPriority((Thread.MIN_PRIORITY));
        t4.setPriority((Thread.MIN_PRIORITY));
        t1.setPriority((Thread.MIN_PRIORITY));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
