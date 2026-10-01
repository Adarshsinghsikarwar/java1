package objectOrientedProgramming;



class myEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int id){
        id = id;
    }

}
public class two {
    public static void main(String[] args) {
      myEmployee ada = new myEmployee();
      ada.setId(12);
      ada.setName("hello");
    }
}
