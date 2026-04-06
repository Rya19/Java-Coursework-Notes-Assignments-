public class Primitivetypes {
    public static void main (String[] args) {
        byte age = 30;
        int viewsCount = 123_456_789; //you can use an _ to serperate large nubers, like how you use , to seperate big numbers
        long viewsCount2 = 3_123_456_789L; //need an "L" at the end because compiler thinks this number is an integer.
        float price = 10.99F; //by default, java sees floats as doubles. Just like L, add an F at the end to tell the compiler this is a float
        char letter = 'A';
        boolean isEligible = true;
    }
    
}