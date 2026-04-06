public class themathclass {
    public static void main(String[] args) {
        int result = Math.round(1.1F); //this math func takes a float, so we need to add an F to it
        System.out.println(result);

        result = (int)Math.ceil(1.1F); //doing this results in an error b/c the result (returns) is a double, and we are storing in an int, so cast around an (int) 
        System.out.println(result);

        result = (int)Math.floor(1.1F);// same with trying the floor
        System.out.println(result);

        result = Math.max(1, 2); //shows the greater number between the 2
        System.out.println(result);

        double result2 = Math.random(); //random returns a double, so make result2 into a double
        System.out.println(result2);

        int result3 = (int) Math.round(Math.random() * 100); //from 0 to 100 | also casting with int b/c we want to store variable that is 4 bytes of memory (int)
        System.out.println(result3);
        //or you can do [(int) (Math.random() * 100)]

        char result4 = (char) Math.round(97 + Math.random() * (122 - 97)); //we are making a random number between 97 and 122 and casting char, storing it in a char variable
        System.out.println(result4);

    }
}