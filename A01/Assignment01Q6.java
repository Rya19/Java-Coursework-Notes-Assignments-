import java.util.Arrays;
import java.util.Scanner;

public class Assignment01Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Rand_Lottery_Number = (int) Math.round(Math.random() * 999.9); //creating random numbers from 0 to 9

        //System.out.println(Rand_Lottery_Number); //For testing purposes

        System.out.println("Enter your lottery pick (three digits): ");
        int User_Input = in.nextInt();


        if (User_Input == Rand_Lottery_Number) {
            System.out.println("Lottery is " + Rand_Lottery_Number);
            System.out.println("Exact match: You win $10,000.");
        }

        else if (sameNumbersDifferentOrder(Rand_Lottery_Number, User_Input)) {
            System.out.println("Lottery is " + Rand_Lottery_Number);
            System.out.println("Match all digits: You win $3,000.");
        }

        
        else if (HasOneSharedNumber(Rand_Lottery_Number, User_Input)) {
            
        }

        else {
            System.out.println("Lottery is " + Rand_Lottery_Number);
            System.out.println("Not an exact match, lost.");
        }

        in.close();

    }

    static boolean sameNumbersDifferentOrder(int L_Num, int U_Num) { //Function to put numbers into array, sort the array and equal them with Array class
        String Lotto_Num = Integer.toString(L_Num);
        String User_Num = Integer.toString(U_Num);

        char[] L_array = Lotto_Num.toCharArray();
        char[] U_array = User_Num.toCharArray();

        Arrays.sort(L_array);
        Arrays.sort(U_array);

        return Arrays.equals(L_array, U_array);
    }

    static boolean HasOneSharedNumber(int[] array_1, int[] array_2) {
        int i = 0;
        int j = 0;

        while (i < array_1.length && j < array_2.length) {
            if (array_1[i] == array_2[j]) {
                return true;
            }
            else if (array_1[i] < array_2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return false;

    }

}