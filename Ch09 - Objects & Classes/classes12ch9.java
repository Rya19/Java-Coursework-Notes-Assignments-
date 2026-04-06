public class classes12ch9 {

    public static void main(String[] args) {
        
        A obj1 = new A(); //created object
        String str = "ABC"; //referece data type

        //before
        System.out.println("obj1 = " + obj1.somenum);
        System.out.println("str = " + str); 

        func(obj1, str); //obj1 passes its reference so its original value can be updated | y will not be updated because its value is just passed

        //after
        System.out.println("obj1 = " + obj1.somenum);
        System.out.println("y = " + str); //str does not get updated, both are reference data type, but string is immutable

    }

    static void func(A obj, String s) { //passing an class object
        s = s + "Z";
        obj.somenum = 200;
    }

}

class A {
    int somenum; //by default this val is 0
}
