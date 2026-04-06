import java.lang.*;
public class Assignment03Q09 {

    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(5);
        MyInteger num2 = new MyInteger(24);

        String num_string = "3539";

        char[] num_char = {'3', '5', '3', '9'};

        System.out.println(num1.isEven());
        System.out.println(num1.isOdd());
        System.out.println(num1.isPrime(15));
        System.out.println(num1.parseInt(num_string)); // I can access this with a object or class itself since its static
        System.out.println(MyInteger.parseInt(num_char));
        System.out.println(num2.isOdd());
        System.out.println(num2.isOdd(45));
        System.out.println(num1.equals(num2));
        System.out.println(num1.equals(5));

        
    }
}

class MyInteger{
    //PRIVATE STUFF
    private int value;

    //PUBLIC STUFF
    public MyInteger() { //Constructor

    }

    public MyInteger(int value) { //Constructor
        this.value = value;
    }


    //GETTER
    public int getValue() {
        return value;
    }


    //NON-STATIC METHODS
    public boolean isEven() { //doesnt need a parameter since the function is an object function, operating on its own variables since explict def inside func
        return value % 2 == 0; //returns true if remainder is 0 if dividing by 2
    }

    public boolean isOdd() {
        return value %2 != 0;
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }


    //STATIC METHODS (required to be static) | These functions belong to class
    public static boolean isEven(int number) { //doesnt need a parameter since the function is an object function, operating on its own variables since explict def inside func
        return number % 2 == 0; //returns true if remainder is 0 if dividing by 2
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger mi1) { //takes a class object
        return mi1.isEven(); //returns if the value of this object is even or not | gets the objects value and runs the function
        //class function takes an OBJECT and returns t/f if the objects value is even or not
    }

    public static boolean isOdd(MyInteger mi1) { //takes a class object
        return mi1.isOdd(); //returns if the value of this object is odd or not | gets the objects value and runs the function
    }

    public static boolean isPrime(MyInteger mi1) { //takes a class object
        return mi1.isPrime(); //returns if the value of this object is prime or not | gets the objects value and runs the function
    }


    //EQUALS FUNCTIONS (non-static; requires object to be called)
    public boolean equals(int num) {
        return this.value == num; //returns true of object value is the same as the number being compared to
    }

    public boolean equals(MyInteger mi1) {
        return this.value == mi1.getValue(); //the object calls this function and compares its value with the value of the calling objects value(?)
    }


    //PARSE FUNCTIONS
    public static int parseInt(char[] char_Array) {
        int res = 0; //stores result
        for (char c : char_Array) { //loops thru char array (use i-loop doesnt work oddly)
            res = res * 10 + (c - '0'); //this is a way to make a char number to an int, times by 10 to shift number to left 1 dec place
        }
        return res;
    }

    public static int parseInt(String str) {
        int res = 0; //stores result
        for (char c : str.toCharArray()) { //same thing as above but string
            res = res * 10 + (c - '0'); //t
        }
        return res;
    }
}

/*
My Integer
----------
- value: int
----------
+ MyInteger (int value)
+ getValue(): int
+ isEven: bool
+ isOdd: bool
+ isPrime: bool
+ equals(int): bool
+ equals(myinteger): bool
+ static isEven: bool (should be underlined)
+ static isOdd: bool (should be underlined)
+ static isPrime: bool (should be underlined)
+ static parseint(char[]): int (should be underlined)
+ static parsent(string): int (should be underlined)


 */