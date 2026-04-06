public class classes5ch9 {

    public static void main(String[] args) {
        A_Class obj1 = new A_Class(5);

        A_Class obj2 = new A_Class(0);

        //obj2 = obj1; //shalow copy, not deep copy | creates new object to have same value of obj1
        //obj2 will referencce to the same variable obj1, which is 5.

        //So do...
        obj2.var1 = obj1.var1; //this is deep copy

        obj2.var1 = 100;

        System.out.println(obj1.var1); //will print its own variable
        System.out.println(obj2.var1);
    }
}

class A_Class {
    int var1; //instance variable, cannot be used unless object has been made.

    A_Class(int num) {
        var1 = num;
    }
}