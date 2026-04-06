public class ExtraCredit2Q16 {
    public static void main(String[] args) {
        //like a map?
        Pair<Integer, String> numberWord = new Pair<>(1, "One");
        System.out.println(numberWord);

        Pair<String, Double> labelPi = new Pair<>("Pi", 3.14);
        System.out.println(labelPi);

        // Update values
        numberWord.setFirst(2);
        numberWord.setSecond("Two");
        System.out.println("After updating: " + numberWord);
    }
}

class Pair<T1, T2> {

    private T1 firstValue;
    private T2 secondValue;

    // Constructor to initialize both values
    public Pair(T1 first, T2 second) {
        this.firstValue = first;
        this.secondValue = second;
    }

    // Setters
    public void setFirst(T1 first) {
        this.firstValue = first;
    }

    public void setSecond(T2 second) {
        this.secondValue = second;
    }

    // Getters
    public T1 getFirst() {
        return firstValue;
    }

    public T2 getSecond() {
        return secondValue;
    }

    // Returns string representation of the pair
    @Override
    public String toString() {
        return "Pair: (" + firstValue + ", " + secondValue + ")";
    }
}
