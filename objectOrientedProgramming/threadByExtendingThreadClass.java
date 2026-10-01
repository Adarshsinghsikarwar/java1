package objectOrientedProgramming;

class myThread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("My thread is running");
            System.out.println("I am Happy");
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("My thread 2 is good");
            System.out.println("I am Sad");
        }
    }
}

public class threadByExtendingThreadClass {
    public static void main(String[] args) {
     myThread1 t1 = new myThread1();
     myThread2 t2 = new myThread2();
     t1.start();
     t2.start();

    }
}
