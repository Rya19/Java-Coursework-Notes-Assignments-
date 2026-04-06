public class strings {
    public static void main(String[] args) {
        String message = "Hello world" + "!!"; //Don't need to use new String("Hello world"); | There is a shorter way... | Can also concatenate other strings
        //Strings are reference types in java
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("sky")); //we can see if a string contains certain characters or words.
        System.out.println(message.replace("!", "*")); //replaces all target characters with replacement | Note: this doesn't modify the original string! String sare immutable
        
    }
    
}