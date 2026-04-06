public class objects2ch10 {

    public static void main(String[] args) {
        String str = "ABC"; //one way to create a string (allocated in memory call constant pool)
        String str2 = new String("ABC"); //allocated in heap are and pool

        /*
        A string vat holds a reference to a string object that stores a string value

        String s = "Java"
        s = "html" //the string object "java" will not be referenced anymore

        the stuff inside will not be changed

        String s1 = "Welc"
        String s2 = new String "Welc"
        String s3 = "Welc"

        s1 == s2 is false
        s1 == s3 is true since s1 and s3 point to the same object

        You can use equals or compareTo to see if the contents are the same


        The matches method is more powerful since it can match a string in a set of string
        EX: "Java is fun".matches("Java.*") * means 0 or more oh that string in the string sets

        "Java is fun".matches("\\sJava.*") the \s will tell java to get the string even if there is a whitespace.

        "440-22-5835".matches("\\d{3}-\\d{2}-\\d{4}") \\d represents single digit, and {3} represents 3
         */


        "Welcome".replaceAll("str", "AB");

        String[] list = "To be or not to be".split(" "); //removes the space in this string list
        for(String word : list) {
            System.out.print(word);
        }

        String s = "a+b$#c".replaceAll("[$#+]", "buh"); //replaces the characters in the bracket with the word "buh"



    }
}