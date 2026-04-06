public class inher12ch11 {

    public static void main(String[] args) {
        Fruit f1 = new Apple(); //assign a object of the subclass to f1

        Apple f2;
        if (f1 instanceof Apple) {
            f2 = (Apple)f1; //compiler doesnt know f1 doesnt reference to object of type apple
        }


    }
}


class Fruit { //parent

}

class Apple extends Fruit { //child
    double weight = 1;

    void func() {
        System.out.println("Weight:" + weight);
    }

}