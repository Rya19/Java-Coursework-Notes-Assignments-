public class ch12except4 {

    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1);

        A obj2 = null;
        System.out.println(obj2); //error since referencing to nothing
    }
}

class A {
    int x;
}