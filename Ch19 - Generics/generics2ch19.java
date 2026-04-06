import java.util.ArrayList;

public class generics2ch19 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(0);
        list.add(new Integer(4));
        System.out.println(list.get(0));

        //Integer x = list.get(0); //comp error because list is an object type and cant store in integer, so you need explicit casting to solve it

        ArrayList<Integer> list2 = new ArrayList<Integer>(0); //so the array is of type Integer




        func(new Integer(67)); //can put these functions into a generic (template) class
        func(new Double(56.774));
        func(new String("Apple"));



        String[] strlist = {"apple", "orange"};
        Integer[] intlist = {3, 4, 5}; //autoboxing, converts these ints to objects
    }

    static <E>void func(E obj) {
        System.out.println(obj);
    }

    public static <E> void print(E[] list) { //function for printing an E type array
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            System.out.println();
        }
    }

    static <E> void func2(E obj) {
        E obj2;

        E[] list = new E[6]; //cannot allocate memory of generic type variable
        System.out.println(obj);
    }

        
}