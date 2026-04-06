import java.util.*;

public class Lab07 {

    public static void main(String[] args) {
        List<Integer> MyList = new ArrayList<Integer>();

        MyList = generateRandomNumbers(11);
        PrintList(MyList);

        Set<Integer> MyList2 = new HashSet<Integer>();
        MyList2 = FilterUniqueNumbers(MyList);

        PrintList(MyList2);

    }


    public static List<Integer> generateRandomNumbers(int size) {
        Random randnum = new Random();
        LinkedList<Integer> LL_List = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            int Random_Var = (int)(randnum.nextInt(size - 1) + size);
            LL_List.add(Random_Var);
        }

        return LL_List;
    }


    static void PrintList(List<Integer> list) {
        System.out.println(list);
    }


    static Set<Integer> FilterUniqueNumbers(List<Integer> list) {
        Set<Integer> NewSet = new HashSet<Integer>();

        for (Integer Element : list) {
            NewSet.add(Element);
        }

        return NewSet;
    }

    static Map<Integer, Integer> countFrequencies(List<Integer> list) {
        
    }

    void printSortedFrequencies(Map<Integer, Integer> frequencyMap) {

    }

    void printNumbersDivisibleBy(List<Integer> numbers, int divisor) {

    }
}