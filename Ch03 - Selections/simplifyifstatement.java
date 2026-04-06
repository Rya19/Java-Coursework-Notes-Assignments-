public class simplifyifstatement {

    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = false; //lets say default is falase
        //*  You can also do: boolean hasHighIncome = (income > 100_000); it will be either true or false based on the income varaible amount

        if (income > 100_000) { // else not needed
            hasHighIncome = true;
        }

        
        
}
}