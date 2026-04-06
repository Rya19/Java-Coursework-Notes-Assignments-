public class twodimarray2ch8 {

    public static void main(String[] args) {
        int[][] table = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}}; //ragged array?

        for(int r = 0; r < table.length; r++) { //r = row
            for(int c = 0; c < table[r].length; c++) { //c = col | start at row 0
                System.out.print(table[r][c] + " "); //will finish inner loop completely, then move to outer, and repeat (refer to ass01 triangle pattern)
            }
            System.out.println(table[r].length); //will execute after inner loop finishes completely for each row done
        }
    }
}