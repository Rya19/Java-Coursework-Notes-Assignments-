public class twodimarray3ch8 {

    public static void main(String[] args) {
        int[][] table = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};
        //out(table)
        out(table[1]); //takes 2d arr at index 1 and prints variables

        int[] list = table[1];
        out(list);

        
    }

    static void out(int[] list) {
        for (int var: list) {
            System.out.println(var);
        }
    }
}