public class classes13ch9 {

    public static void main(String[] args) {
        A[] list = new A[10]; //an array of objects of class A | this statement will not create an array of 5 objects. Instead, it will create an array that can HOLD 5 objects
        //each element in the array without objects will be referenced to null

        //list[0] = new A(); //this will create an object at index 0, so need new statement

        for (int i = 0; i < list.length; i++) {
            list[i] = new A(); //an array of 10 objects 
        }

    }
}

class A {
    int x;
}