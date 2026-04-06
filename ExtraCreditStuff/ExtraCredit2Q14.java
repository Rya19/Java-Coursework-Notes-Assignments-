public class ExtraCredit2Q14 {
    public static void main(String[] args) {
        Integer[][] intArray = {
            {1, 9, 3},
            {4, 4, 6}
        };

        Double[][] doubleArray = {
            {1.5, 2.25, 3.5},
            {4.3, 6.2, 2.1}
        };

        System.out.println("2D 1 max: " + findMax(intArray));
        System.out.println("2D 2 max: " + findMax(doubleArray));
    }

        //Method to find max value from passed array of any type
        public static <E extends Comparable<E>> E findMax(E[][] array) {
            E max = array[0][0]; //varaible to store max
    
            for (E[] row : array) { //double loop b/c 2d array
                for (E value : row) {
                    if (value.compareTo(max) > 0) {
                        max = value;
                    }
                }
            }
    
            return max;
        }
}
