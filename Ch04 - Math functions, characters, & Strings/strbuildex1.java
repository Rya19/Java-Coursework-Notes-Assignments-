public class strbuildex1 {

    public static void main(String[] args) {
        StringBuilder sb_obj = new StringBuilder("Hello");

        sb_obj.append(" World"); //adds world to string hello

        System.out.println(sb_obj);

        sb_obj.insert(5, ","); //adds comma at index 5

        System.out.println(sb_obj);

        sb_obj.replace(7, 12, "Java");

        System.out.println(sb_obj);

        sb_obj.delete(5, 6); //deletes at indexes

        System.out.println(sb_obj);

        sb_obj.reverse(); //reverses

        System.out.println(sb_obj);

    }
}