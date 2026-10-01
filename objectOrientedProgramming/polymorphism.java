package objectOrientedProgramming;

interface camera2 {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello Good Morning");
    }
    default void recordIn4K(){ // we can override the function in inheritance class
        greet();
        System.out.println("Here you can record in 4K video");
    }
}
interface wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class cellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting");
    }
}
class mySmartPhone2 extends cellPhone implements wifi2 , camera2{
    public void takeSnap(){
        System.out.println("Take Snap");
    }
    public void recordVideo(){
        System.out.println("Take Snap");
    }
    public String[] getNetwork(){
        System.out.println("Getting List of Network");
        String[] networkList = {"adarsh","prashant","mohan5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to : " + network);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        camera2 cam1 = new mySmartPhone2(); // this is smartPhone but use as camera
//        cam1.getnetwork();  it is not allowed
        cam1.recordIn4K();
    }
}
