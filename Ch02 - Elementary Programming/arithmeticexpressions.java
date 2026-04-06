public class arithmeticexpressions {
    public static void main(String[] args) {
        int result = 10 / 3; //can do add, sub, mult, div, mod
        //if you want to dive 2 whole numbers and get a float number, you can do this
        double result2 = (double)10 / (double)3; //add (double) to the numbers, and change variable type to double
        System.out.println(result2);

        int x = 1;
        //x++;//increment operator | can do ++x as well
        int y = ++x; //x++ will output 2, 1. to make them the same, do ++x

        int z = 1;
        z = z + 2; //or z+=2
        System.out.println(z);
    }
}