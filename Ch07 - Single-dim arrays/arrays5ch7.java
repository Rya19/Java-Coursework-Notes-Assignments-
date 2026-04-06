public class arrays5ch7 {

    public static void main(String[] args) {
        int[] arr = new int[0];
        m(1); //if using void m(double z, int... list) then need z in
        m(1, 2); //first param will belong to z as shown
        m(1, 2, 3); //will create an array behind the scenes

        //if the program firs took a char (like char z) and you passed a integer, it will not work. you must pass a char, but if its double, you can pass a char and it ill be auto-convert to an int
    }

    static int[] reverse (int[] list) { //to reverse an array
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i]; //returning a reference to an array
        }

        return result;
    }

                    //default: m(int... list)
    static void m(double z, int... list) { //can receieve any # of arguments, you can have other varaible types, but must be behind the ... part like "void m(double z, int... list)"
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println(); //put this after loop to start on a new line
    }

}