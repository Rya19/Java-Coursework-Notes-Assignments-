public class methodsch6 {

    public static void main(String[] args) { //syntax error will be set here if psv not incldued for main
        methodsch6 obj1 = new methodsch6(); //if func you made isn't static, you have to make an object like as said below v
        System.out.println(obj1.add(4, 5)); //if the func is non static, then you must make a new object like: filename varaiblename = new filename();
        //if func was static, no object creation is needed
    }

    int add(int x, int y) { //nonstatic method cant be called from static method | instance of a class is an object of the class
        return x + y;
    }


}