public class castingch2 {

    public static void main(String[] args) {
        int x = (int)1.5; //can expliicitly cast 1.5 as an int so it can be saved into an integer variable

        double y = 1.5;
        int z = (int)y; //since y is a double, turns y into an integer to be stored into an integer variable
        System.out.println(y);
    }
}