public class methods3ch6 {

    public static void main(String[] args) {
        System.out.println(compare(1.2F, 2.3F)); //if you pass decimal #'s here, you will get an error due to the range, so put an F at the end of the number to treat them as a float

        int x = 5; //if you put this in a block {} it will get an error trying to print b/c its local to that block, cannot be accessed outside the block, similar to for-loops (i variable)



        //int i; //error if you declare a dupe varaible while that var belongs into a block
        for (int i = 0; i < 5; i++) {

        }

    }

    static int compare(int x, int y) {
        if (x >= y) {
            return x; 
        }
        else {
            return y;
        }
    }

    static float compare(float x, float y) { //you can overload but have different parameters and type, static must be the same as well
        if (x >= y) {
            return x; 
        }
        else {
            return y;
        }
    }

    static char compare (char x, char y) { //another example of overloading 
        if (x >= y) {
            return x; 
        }
        else {
            return y;
        }
    }
}