public class ifstatements {

    public static void main(String[] args) {
        int temp = 10;

        if (temp > 30) {
            System.out.println("Its a hot day");
            //blah blah blah more stuff
        }

        else if (temp > 20 ) { // && temp <= 30 ?
            System.out.println("Nice day");
            //blah blah blah
        }

        else {
            System.out.println("cold");
        }
    }
}