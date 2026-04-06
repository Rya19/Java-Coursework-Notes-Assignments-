public class foreachloop {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) { //To start from end: i = fruits.length; i > 0; i--
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits)  {//for each fruits in fruit array
            System.out.println(fruit);
        }
    }
}