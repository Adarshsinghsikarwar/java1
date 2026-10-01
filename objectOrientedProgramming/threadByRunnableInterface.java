package objectOrientedProgramming;

class threads implements Runnable{
    @Override
    public void run() {
        System.out.println("hello world");
    }
}
public class threadByRunnableInterface {
    public static void main(String[] args) {
        threads th = new threads();

    }
}
