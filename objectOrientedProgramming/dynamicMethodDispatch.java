package objectOrientedProgramming;

class phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on (){
        System.out.println("turning on phone...");
    }
}
class smartPhone extends phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on (){
        System.out.println("turning on Smartphone...");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
//      phone a = new phone();
//      a.showTime();
//      smartPhone b =  new smartPhone();
//      b.music();

      phone c = new smartPhone(); // it is allowed
//        smartPhone d = new phone();  it is not allowed
        c.showTime();
        c.on();
//        c.music();  it not allowed

    }
}
