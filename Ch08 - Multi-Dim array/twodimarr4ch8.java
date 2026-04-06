public class twodimarr4ch8 {

    public static void main(String[] args) {
                       //col
        int[][] table = {{2, 3, 6}, //row
                         {6, 2, 1}}; //find the min index for the max

        int col;
        int row;
        int max = table[0][0];
        int idxR = 0;
        int idxC = 0;

        for (int r = 0; r < table.length; r++) {
            col = findMax(table[r]);
            row = r;

            if (table[row][col] > max) {
                idxR = row;
                idxC = col;
                max = table[row][col]; // to find max
            }

        }
        System.out.println("row = " + idxR + " , col = " + idxC);

    }

    static int findMax(int[] list) { //taes 2d-array(nevermind)
        int max = list[0];
        int idx = 0;

        for (int i = 1; i < list.length; i++) { //starts at 1 b/c var max selected at ind 0
            if (list[i] > max) {
                max = list[i];
                idx = i;
            }
        }

        return idx;

    }
}