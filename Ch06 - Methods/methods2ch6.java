public class methods2ch6 {
    static int x = 1; //can creat e aglobal varaible outside psv, to use it has to be static or if not, create an object to use htis variable
    public static void main(String[] args) {
        System.out.println(methods2ch6.compare(2, 3)); //Can call the func by using class object

        //System.out.println(out()); //not allowed to call void method in a print statement, you cant assign it to a varaible either

    }

    static int compare (int x, int y) { //if method is void, you can return nothing to terminate func, but if you have lines under return, they wont be executed
        if ( x >= y) {
            return x;
        }
        else  { //if there is no else condition, there will be an return error
            return y;
        }
    }

    static void out() {
        System.out.println(123);
    }
}

class A {
    public static void main(String[] args) {
        System.out.println(methods2ch6.compare(2, 3)); //because the func is static, need to use object and use dot notiation if the func is part of a different class, then you will invoke the function
    }
}