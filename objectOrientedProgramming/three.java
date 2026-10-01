package objectOrientedProgramming;

class myMainEmployee{
    private int id;
    private String name;
    public myMainEmployee(){

    }
    public myMainEmployee(String a){
        id = 12;
        name = a;
    }
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
public class three {
    public static void main(String[] args) {
        myMainEmployee he = new myMainEmployee("hell");
        System.out.println(he.getName());
        System.out.println(he.getId());
    }
}
