import java.util.*;
public class Assignment02Q18 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int[][] Temperature = new int[2][12]; //2 rows 12 columns

        System.out.println("Enter the high temepratures for each month: ");
        for (int i = 0; i < 12; i++) {
            Temperature[0][i] = user_input.nextInt(); //Will read numbers on a single line seperated by a space
        }

        System.out.println("Enter the low temepratures for each month: ");
        for (int i = 0; i < 12; i++) {
            Temperature[1][i] = user_input.nextInt(); //Will read numbers on a single line seperated by a space
        }

        /*
        for (int r = 0; r < Temperature.length; r++) {
            for(int c = 0; c < Temperature[r].length; c++) {
                System.out.print(Temperature[r][c] + " ");
            }
            System.out.println();
        }
        */

        System.out.println("Average high temperature: " + AvgHightemp(Temperature));
        System.out.println("Average low temperature: " +AvgLowtemp(Temperature));
        System.out.println("Highest temperature: " + HighestTemp(Temperature));
        System.out.println("Lowest temperature: " + LowestTemp(Temperature));


        user_input.close();
    }

    static int AvgHightemp(int[][] temp_array) {
        int Avg_high = 0;
        int Total_Temp = 0;

        for (int c = 0; c < temp_array[0].length; c++) {
            Total_Temp += temp_array[0][c];
        }
        Avg_high = Total_Temp / temp_array[0].length;

        return Avg_high;
    }

    static int AvgLowtemp(int[][] temp_array) {
        int Avg_low = 0;
        int Total_Temp = 0;

        for (int c = 0; c < temp_array[1].length; c++) {
            Total_Temp += temp_array[1][c];
        }
        Avg_low = Total_Temp / temp_array[1].length;

        return Avg_low;
    }


    static int HighestTemp(int[][] temp_array) {
        int Highest_temp = temp_array[0][0];

        for (int c = 0; c < temp_array[0].length; c++) {
            if (temp_array[0][c] > Highest_temp) {
                Highest_temp = temp_array[0][c];
            }
        }

        return Highest_temp;
    }

    static int LowestTemp(int[][] temp_array) {
        int Lowest_Temp = temp_array[0][0];

        for (int c = 0; c < temp_array[0].length; c++) {
            if (temp_array[0][c] < Lowest_Temp) {
                Lowest_Temp = temp_array[0][c];
            }
        }

        return Lowest_Temp;
    }
}