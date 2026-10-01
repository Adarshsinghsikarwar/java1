package objectOrientedProgramming;


class Employee{
      int id;
      String name;
      int salary;
      public void printDetails(){
          System.out.println("The id : " + id);
          System.out.println("The name :" + name);
      }
      public int getSalary(){
          return salary;
      }
}

public class one {
    public static void main(String[] args) {
        System.out.println("Hello we are in custom class");
        Employee adarsh = new Employee();
        adarsh.id = 12;
        adarsh.name = "papa";
        adarsh.salary = 34000;
//        System.out.println(adarsh.id);
//        System.out.println(adarsh.name);
        adarsh.printDetails();
        int salary = adarsh.getSalary();
        System.out.println(salary);
    }
}
