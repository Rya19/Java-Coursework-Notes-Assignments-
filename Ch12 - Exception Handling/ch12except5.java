public class ch12except5 {

    public static void main(String[] args) throws Exception {
        try {
            func1();
        }
        catch(ArithmeticException obj) {
            //System.out.println(obj.getMessage()); //will only print the message of the exception
            //obj.printStackTrace(); //prints everything

            StackTraceElement[] list = obj.getStackTrace(); //only gets a specific error
            
            for (StackTraceElement m : list) {
                System.out.println(m.getMethodName());
            }
        }

        //main is invoked in stack, then func1, then func2, then func3, then func4, but func4 shoots out an error, so does func3 have a catch? no, remove it from callstack.
        //Does func2 have catch? no, remove from stack, and keep going until it finds a catch, otherwise, terminate normally
    }

    static void func1() {
        func2();
    }

    static void func2() {
        func3();
    }

    static void func3() {
        func4();
    }  

    static void func4() {
        throw new ArithmeticException("Func_4 error");
        //If theres no catch block here, the method will be remvoed from the call stack
    }  

}

