public class classes10ch9 {

    public static void main(String[] args) {
        
    }
}

class BankAccount {
    private double balance;

    void setBalance(double balance) {
        this.balance = balance; //this used in 2 places, 1 to reference the memebr of the class and 2, to call a constructor from another cosntructor
    }

}


class user1 { //making a user class
    public static void main(String[] args) {
        BankAccount user_1 = new BankAccount(); //user has a bankaccount
        //user_1.balance = 55; //you cant do this unless it is default
    }
}



class user2 { //making a user class
    public static void main(String[] args) {
        BankAccount user_2 = new BankAccount(); //user has a bankaccount
        //user_2.balance = 55; //you cant do this unless it is default
    }
}