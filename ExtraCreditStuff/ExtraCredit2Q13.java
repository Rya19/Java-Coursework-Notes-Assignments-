import java.util.ArrayList;

public class ExtraCredit2Q13 {


    public static void main(String[] args) {
        //For integers input
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(14);
        integerList.add(24);
        integerList.add(14);
        integerList.add(42);
        integerList.add(25);

        System.out.println("List 1 Before: " + integerList);
        System.out.println("List 1 After: " + removeDuplicates(integerList));

        //double input
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(14.5);
        doubleList.add(25.25);
        doubleList.add(14.4);
        doubleList.add(42.1);
        doubleList.add(25.25);

        System.out.println("List 2 Before: " + doubleList);
        System.out.println("List 2 After: " + removeDuplicates(doubleList));
    }

        // method that removes duplicate elements from a generic list
        public static <E> ArrayList<E> removeDuplicates(ArrayList<E> originalList) {
            ArrayList<E> uniqueList = new ArrayList<>(); //create arraylist object
    
            for (E element : originalList) {
                if (!uniqueList.contains(element)) { //if the list does not contain elements from the passed list
                    uniqueList.add(element);
                }
            }
    
            return uniqueList;
        }
}
