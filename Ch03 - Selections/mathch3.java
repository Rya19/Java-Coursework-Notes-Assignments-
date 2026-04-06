//CHAPTER4
public class mathch3 {
    public static void main(String[] args) {
        System.out.println(Math.pow(4, 2)); //power, PI, sqrt | static memebrs can be invoked using their function names
        int r = (int)(Math.random()*10); //random gives a double, cant put double into int, so cast random with an int
        // ^ this statement gives 0 based on the order of operators, math.rand will get turned to an int (which is 0) and 0 * 10 = 0, so use parenthasis
        //System.out.println(Math.random() * 10);
        System.out.println(r);


        //What if want to generate rand # from #a to #b?
        int min = 2;
        int max = 8;
        int rand = (int)(min + Math.random() * (max - min));
        System.out.println(rand);


    }
}