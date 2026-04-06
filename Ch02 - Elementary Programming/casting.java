public class casting {
    public static void main(String[] args) {
        //implicit casting
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 2; //when we have a value that has smaller bits than the one we are storing into (short is 2 bits, int is 4 bits), conversion happens inmplicitly or automatically
        System.out.println(y);

        double x2 = 1.1;
        double y2 = x2 + 2; //java casts the 2 automatically as a double.
        System.out.println(y2);

        //what if you want y as an int?
        double x3 = 1.1; //double (8 bits) is bigger than int(4 bits), so convert x3 into an int with explicit casting
        int y3 = (int)x3 + 2; //turn x3 into an int | this is explicit casting
        System.out.println(y3);

        //excplicit casting happens only with compatible types

        //what if x is a string?
        String x4 = "1";
        int y4 = Integer.parseInt(x4) + 2; //takes a string variable and converts it to an integer
        System.out.println(y4);

        //what if x is a float string?
        String x5 = "1.1";
        double y5 = Double.parseDouble(x5) + 2; //if x is a double, use double keywords as shown in this line | uses lang package
        System.out.println(y5);
        
    }
    
}