package objectOrientedProgramming;


class Base1{
    Base1 (){
        System.out.println("I am base class constructor");
    }
    Base1(int x){
        System.out.println("I am overloaded base class constructor : " + x);
    }
    int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(12);
        System.out.println("I am derived class constructor ");
    }
    Derived1(int a , int b){
        super(a);
        System.out.println("I am overloaded derived class constructor : " + b);
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childClass extends Derived1{
    childClass(){
        System.out.println("I am childClass constructor ");
    }
    childClass(int a ,int b , int c){
        super(a,b);
        System.out.println("I am overloaded childClass constructor : " + c);
    }
}

public class constructorInheritance {
    public static void main(String[] args) {
//      Base1 b = new Base1();
//        Derived1 b = new Derived1();
//        Derived1 b = new Derived1(12,13);
        childClass cd = new childClass(12,13,14);

    }
}
