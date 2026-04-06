public class inher7ch11 {

    public static void main(String[] args) {
        A_superclass[] list_1 = {new A_superclass(), new B_childclass()};

    func(new A_superclass());
        

    }


    static void func(A_superclass obj) {

    }

}




class A_superclass {

}


class B_childclass extends A_superclass { 

}

class C_childclass extends A_superclass {

}