package objectOrientedProgramming;


class A{
    int x ;
    public int adarsh(){
        return 3;
    }
    public void meth2(){
        System.out.println("I am meth2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am meth2 of class B");
    }
    public void meth3(){
        System.out.println("I am meth3 of class B");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
       A a = new A();
       B b = new B();
       a.meth2();
       b.meth2();
    }
}
