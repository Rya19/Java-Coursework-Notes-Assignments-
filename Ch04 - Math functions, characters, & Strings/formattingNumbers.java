import java.text.NumberFormat;

public class formattingNumbers {

    public static void main(String[] args) {
        //Factory method, makes objects
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //class in java called NumbeerFormat | we create a instance of the number | we get the result from an object and store it into the numberformat variable named currency
        String result = currency.format(1234567.891); //currency is an object, so we can have access to the numberformat's functions
        //Can also do: String result = NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result);
        
    }
}