public class incher14ch11 {
    public static void main(String[] args) {
        
        Apple fruit_1 = new Apple(1.5);
        Apple fruit_2 = new Apple(1.5);

        System.out.println(fruit_1.equals(fruit_2)); //false since these dont have the same memory address (pre-override)

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