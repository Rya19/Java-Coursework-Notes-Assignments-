public class arraysch7 {

    public static void main(String[] args) {
        //int x; //a variable of a single type
        int[] list; //an array of integers | printing this while nothing is set to it will get you a syntax error
        list = new int[5]; //can do this in 1 statement

        for(int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 11); //cannot assign a double to an int, so cast it with an int to fix the error 
        }

        for(int x : list) { //for x numbers in list | this loop is only for reading arrays, cannot make changes in array
            System.out.print(x + " ");
        }


    }
}