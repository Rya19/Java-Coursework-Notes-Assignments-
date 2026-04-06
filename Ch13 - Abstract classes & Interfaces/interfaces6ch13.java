import java.util.Arrays;

public class interfaces6ch13 {

    public static void main(String[] args) {
        A[] list = {new A(8), new A(2), new A(7), new A(9)}; //array of objects
        for (A obj: list) {
            System.out.print(obj.num + " "); //before sort
        }

        Arrays.sort(list);
        System.out.println();

        for (A obj: list) { //after sort
            System.out.print(obj.num + " ");
        }
        
    }
}

interface Fruit {
    public static final int x = 0; //int x = 0 is also valid 
    
}

class A implements Comparable<A> { //comparable <classname> | need to override compareTo to remove error
    int num;

    A(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(A o) { //overriding the abstract class's function that belongs to Comparable
        if (this.num > o.num) {
            return 1;
        }
        else if (this.num < o.num) {
            return -1;
        }
        else {
            return 0;
        }
    }


}