public class loops2ch5 {

    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) { //triangle multiple for-loop
            for (int i = 0; i < j; i++) {
                System.out.print(i + " "); //will create numbers between 1 - 10
            }
            System.out.println(); //will move to the next line after inner loop finishes compiling, then continuing executing
        }



        int count = 0;
        while (count < 10) {
            if (count == 5) {
                count++; //increment the value then skip it
                continue;
            }
            System.out.println(count);
            count++;
        }

        do { //same thing as above while-loop code
            count++;
        } while (count < 10);
    }
}