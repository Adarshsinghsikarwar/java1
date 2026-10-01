package objectOrientedProgramming;


abstract class Parent2{
    public Parent2(){
        System.out.println("I am constructor of parent class");
    }
    public void printHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstractClass {
    public static void main(String[] args) {
//        Parent2 p = new Parent2(); it is not allowed
        Child2 c = new Child2();
//        Child3 c3 = new Child3(); it is also not allowed
    }
}
