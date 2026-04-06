public class classes11ch9 {

    public static void main(String[] args) {
        
        A obj1 = new A(); //created object
        int y = 5; //primitive data type



        System.out.println("obj1 = " + obj1.somenum);
        System.out.println("y = " + y); 

        func(obj1, y); //obj1 passes its reference so its original value can be updated | y will not be updated because its value is just passed

        System.out.println("obj1 = " + obj1.somenum);
        System.out.println("y = " + y); 

    }

    static void func(A obj, int num) { //passing an class object
        num = 100;
        obj.somenum = 200;
    }

}

class A {
    int somenum; //by default this val is 0
}