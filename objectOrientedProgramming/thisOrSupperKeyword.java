package objectOrientedProgramming;

class EkClass{
    int a;

    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
}
public class thisOrSupperKeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(3);
        System.out.println(e.getA());
    }
}
