import java.util.ArrayList;

public class ExtraCredit2Q15 {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(14);
        intList.add(24);
        intList.add(4);
        intList.add(42);
        intList.add(5);



        System.out.println("List1 before sorting: " + intList);
        sortList(intList);
        System.out.println("List1 after sorting: " + intList);



        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(14.5);
        doubleList.add(24.3);
        doubleList.add(4.5);
        doubleList.add(42.1);
        doubleList.add(5.0);


        
        System.out.println("List2 before sorting: " + doubleList);
        sortList(doubleList);
        System.out.println("List2 after sorting: " + doubleList);
    }

        //Sorts list in own way
        public static <E extends Comparable<E>> void sortList(ArrayList<E> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                int minIndex = i;
    
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                        minIndex = j;
                    }
                }
    
                // Swap elements
                E temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
}
