package objectOrientedProgramming;

public class dataHiding {
    private double balance ;

    // method :: public
    public double getBalance(double balance) {
//        withdrawing money
        boolean result = validate("sachin","sachin123");
        if (result == true){
            this.balance = this.balance - balance;
            System.out.println("withdrawing " + balance);
        }
        else{
            System.out.println("Invalid username and password try again");
        }
        return 0.0f;
    }
    // method :: public
    public void setBalance ( double balance ){
        boolean result = validate("sachin","sachin123");
        if (result == true){
           this.balance = this.balance + balance;
            System.out.println("credited to the account");
        }
        else {
            System.out.println("Invalid username and password try again");
        }

    }
    // method :: private
    private boolean validate(String userName ,String password){
        // logic for authentication
       return userName.equalsIgnoreCase("sachin") && password.equals("sachin123") ? true : false;
    }
}
class testApp
{
    public static void main(String[] args) {
        dataHiding acc = new dataHiding();
        acc.getBalance(1000.0);
    }
}


