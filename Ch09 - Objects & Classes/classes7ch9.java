public class classes7ch9 {

    public static void main(String[] args) {
        Account acc1 = new Account();
        //acc1.balance = 10; Variable not visible and cannot be accessed once balance is private
        //So use set/get mthods

        acc1.setbalance(10);

    }
}

class Account {
    private double balance; //making this private will not allow oyu to access it, but you can use set/get functions
    int id;
    static int something;


    Account() { //constructors
        balance = 5;
    }
    Account(double balance) {
        this(balance, 1234); //initialized local variable with parameter
    }
    Account(double balance, int id) {
        this.balance = balance;
        this.id = id;
    }


    void setbalance(double bal) {
        this.balance = bal; //this keyword craetes a self object that is used internally by the program.
        System.out.println(this.getbalance()); 
        //System.out.println(Account.something); //something is a static member of the class
    }

    double getbalance() {
        return balance;
    }
}

//creating class of users
class user {
    public static void main(String[] args) {
        Account u_acc1 = new Account();
        u_acc1.balance = 0; //can do this because balance is not pric\vate at the moment (well now yo ucant)
    }
}

class user2 {
    public static void main(String[] args) {
        Account u_acc2 = new Account();
        u_acc2.balance = u_acc2.balance + 5;
    }
}