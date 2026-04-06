import java.util.*;
public class Assignment02Q17 {

    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);

        System.out.println("Enter the amount of candidates you want to add: ");
        int user_input_can_amt = user_in.nextInt();

        String Candidates[][] = new String[user_input_can_amt][2]; //5 r 2 c


        for (int r = 0; r < Candidates.length; r++) { //Loop to add all the presidents
            System.out.println("Enter presidential candidates " + "#" + r + " last name: ");
            String user_input_names = user_in.next();
            Candidates[r][0] = user_input_names; //Only need 2 | stores names in column 0

            System.out.println("Enter the inputted president's votes received: ");
            int user_input_votes = user_in.nextInt();
            Candidates[r][1] = Integer.toString(user_input_votes); //stores votes in column 1
        }

        System.out.printf("%-15s %-15s %-15s", "Candidates", "Vote Amounts" , "% of Total Votes" + "\n"); //print format
        System.out.print(Print_Results(Candidates, Votes_Total(Candidates)));

        user_in.close();

    }



    static int Votes_Total(String[][] User_Array) { //takes array (specifically the candidiate one)
        int Vote_Total = 0;
        for (int i = 0; i < User_Array.length; i++) {
            Vote_Total += Integer.parseInt(User_Array[i][1]); //adds up the total of all the votes in column 1
        }
        //System.out.println(Vote_Total);
        return Vote_Total;
    }



    static String Print_Results(String[][] User_Array_Candidates, int Votes_Amount) {
        int Highest_Votes = 0;
        String Highest_Candidate = "";
        double Vote_Percentage = 0.0;

        for(int r = 0; r < User_Array_Candidates.length; r++) {
            Vote_Percentage = (Double.parseDouble(User_Array_Candidates[r][1]) / Votes_Amount) * 100; //converts column 1 to a double (oringally string) and divides by total votes and times by 100

            if (Integer.parseInt(User_Array_Candidates[r][1]) > Highest_Votes) { //if  col 1 has higher votes than the current highest vote total...
                Highest_Votes = Integer.parseInt(User_Array_Candidates[r][1]); //highest vote will be set by that candidates vote amount
                Highest_Candidate = User_Array_Candidates[r][0]; //name will also be placed in cand var
            }

            System.out.printf("%-15s %-15s %-15.2f%n", User_Array_Candidates[r][0], User_Array_Candidates[r][1], Vote_Percentage); //prints out cand name, vote amnt, and percent
        }

        System.out.println("The winner of the election is: ");
        return Highest_Candidate;
    }
}