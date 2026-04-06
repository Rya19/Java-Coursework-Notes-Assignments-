public class objects3ch10 {

    public static void main(String[] args) {
        //String buffer and String builder

        StringBuilder str = new StringBuilder("ABC");
        str.append("xys"); //if yo uare making changes to a lot of strings, then a good choice is a string builder, you will waste memory and create more computation time
        //^ ABCxys
        System.out.println(str.length());
        System.out.println(str.capacity());


        

    }
}