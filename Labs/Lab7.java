import java.util.*;
import java.util.stream.Collectors;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> randomNumbers = generateRandomNumbers(10);
        printList(randomNumbers);


        Set<Integer> uniqueNumbers = filterUniqueNumbers(randomNumbers);
        List<Integer> sortedUnique = new ArrayList<>(uniqueNumbers);

        Collections.sort(sortedUnique);
        System.out.println("Unique Numbers: " + sortedUnique);

        Map<Integer, Integer> frequencyMap = countFrequencies(randomNumbers);
        printSortedFrequencies(frequencyMap);

        System.out.print("Enter a divisor to filter numbers: ");
        int divisor = scanner.nextInt();
        printNumbersDivisibleBy(randomNumbers, divisor);

        scanner.close();
    }

    public static List<Integer> generateRandomNumbers(int size) {
        Random rand = new Random();

        List<Integer> randomNumbers = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            randomNumbers.add(rand.nextInt(20) + 1); // 1 to 20
        }
        return randomNumbers;
    }

    public static void printList(List<Integer> numbers) {
        System.out.println("Generated List: " + numbers);
    }


    public static Set<Integer> filterUniqueNumbers(List<Integer> numbers) {
        return new HashSet<>(numbers);
    }


    public static Map<Integer, Integer> countFrequencies(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    public static void printSortedFrequencies(Map<Integer, Integer> frequencyMap) {
        System.out.println("Frequencies:");
        frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }

    public static void printNumbersDivisibleBy(List<Integer> numbers, int divisor) {
        System.out.println("Numbers divisible by " + divisor + ":");
        
        numbers.forEach(n -> {
            if (n % divisor == 0) {
                System.out.print(n + " ");
            }
        });

        System.out.println(); // Newline
    }
}
