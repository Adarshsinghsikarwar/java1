package objectOrientedProgramming;

import com.sun.security.jgss.GSSUtil;

interface biCycle{
    int a = 45;
    void applyBreak(int decrement);
    void applySpeedUp(int increment);
}
class avonCycle implements biCycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int decrement){
        System.out.println("apply brake");
    }
    public void applySpeedUp(int increment){
        System.out.println("apply speed");
    }
}
public class Interface {
    public static void main(String[] args) {
       avonCycle cycle1 = new avonCycle();
       cycle1.applyBreak(1);
       // You can create properties in interface
        System.out.println(biCycle.a);

    }
}
