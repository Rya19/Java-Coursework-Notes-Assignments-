public class twodimarray1ch8 {

    public static void main(String[] args) {
        int[][] table;
        table = new int[3][4]; //2d array 3 rows 4 column

        for(int r = 0; r < table.length; r++) { //r = row
            for(int c = 0; c < table[r].length; c++) { //c = col | start at row 0
                System.out.println(table[r][c] + " "); //will finish inner loop completely, then move to outer, and repeat (refer to ass01 triangle pattern)
            }
            System.out.println(); //will execute after inner loop finishes completely for each row done
        }
    }
}