public class slection2ch3 {

    public static void main(String[] args) {
        int x = 5;
        boolean b = (x > 1 || x++ < 10); //bool express stored in a bool variable | using a single | or & will change the value of x to 6


        switch (x) {
            case 1: { //if you use a variable as a case number, the variable must be a constant or a final | Ex: final int num = 4;
                System.out.println("one");
                break;
            }
            default: {
                System.out.println("not one");
                break;
            }
        }

    }
}