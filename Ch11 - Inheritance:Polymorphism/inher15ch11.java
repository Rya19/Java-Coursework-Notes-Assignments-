import java.util.ArrayList;

public class inher15ch11 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(0); //these arrrays can only hold reference variables
        list.add(new Integer(4));

        System.out.println(list.get(0));
        System.out.println(list.size());

    }
}

class Apple extends Fruit { //child
    double weight = 1;

    Apple(double weight) {
        this.weight = weight;
    }

    void output() {
        System.out.println("Weight:" + weight);
    }

    @Override
    public boolean equals(Object obj) {
        return this.weight == ((Apple)obj).weight; //weight is not of type Obj, so we need to tell the compiler that obj is reference of type apple, so we need casting
    }

}