public class Assignment01Q9 {

    public static void main(String[] args) {
        for (int j = 1; j <= 6; j++) { //triangle multiple for-loop | Pattern A
            for (int i = 1; i < j+1; i++) {
                System.out.print(i + " "); //will create numbers between 1 - 6
            }
            System.out.println(); //will move to the next line after inner loop finishes compiling, then continuing executing
        }

        System.out.println();

        for (int i = 6; i >= 1; i--) { //Pattern B | controls # of rows, stats from 6 and decreases until it reaches 1 | each iteration represent a row
            for (int j = 1; j <= i; j++) { // prints the numbers in each row, starts from 1 and goes up to i value , it will go print out all numbers til ith value, then start again from the outer loop
                System.out.print(j + " ");
            }
            System.out.println(); //starts a new line after the inner loop is done executing
        }

        System.out.println();

        for (int i = 0; i < 6; i++) { //Pattern C
            for (int j = 0; j < i; j++) { //number of spaces to print as long as j < 1 | Ex: first row, no spaces needed b/c j < 0 is false
                System.out.print("  ");
            }

            for (int k = 1; k <= 6 - i; k++) { //prints out all numbers from 1 - 6 and then exits from this loop
                System.out.print(k + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 6; i++) { //Pattern D
            for (int j = 0; j <= 6 - i; j++) { //number of spaces to print as long as j < 1 | Ex: first row, no spaces needed b/c j < 0 is false
                System.out.print("  ");
            }

            for (int k = 1; k <= i + 1; k++) { //prints out all numbers from 1 - 6 and then exits from this loop
                System.out.print(k + " ");
            }

            System.out.println();
        }

    }
}