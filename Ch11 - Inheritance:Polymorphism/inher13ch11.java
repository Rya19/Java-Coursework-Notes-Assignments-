public class inher13ch11 {

    public static void main(String[] args) {
        Fruit f1 = new Apple(); //assign a object of the subclass to f1
        //you cannot assign a subclass type to a instance of a superclass.

        if(f1 instanceof Apple) {
            ((Apple)f1).func(); //func is not a member of f1 of type Fruit | evaluate the casting before to do the function
            //We tell the compiler this fruit object type f1 is an instance of apple, and we want to run its func function
        }
       // f1.func(); //I cant access this code, what is the variable of type f1? It's fruit. 
        
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