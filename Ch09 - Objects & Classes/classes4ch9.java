public class classes4ch9 {

    public static void main(String[] args) {
        A_Class obj1 = new A_Class(5);

        System.out.println(obj1.var1); //will print the number put in the constructor parameter

        A_Class obj2 = null;
        //ob2 = new A_Class(5); //this will fix it
        System.out.println(obj2.var1); //will print out null | java will check: If class a has a data field var1, and if reference variable obj2 is initialized
        //printing obj2.var1 will result in compilation error since obj2 has not been initialized/given a value
    }
}

class A_Class {
    int var1; //instance variable, cannot be used unless object has been made.

    A_Class(int num) {
        var1 = num;
    }
}