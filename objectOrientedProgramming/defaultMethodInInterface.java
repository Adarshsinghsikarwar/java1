package objectOrientedProgramming;

interface camera {
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
interface wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting");
    }
}
class mySmartPhone extends cellPhone implements wifi , camera{
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
public class defaultMethodInInterface {
    public static void main(String[] args) {
      mySmartPhone mh = new mySmartPhone();
      mh.recordIn4K();
//      mh.greet();  it will through an error
      String[] net= mh.getNetwork();
      for (String x : net){
          System.out.print(x + " ");
      }

    }
}
