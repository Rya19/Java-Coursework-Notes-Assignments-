import java.lang.reflect.*;

public class Assignment05Q8 {

    public static void main(String[] args) {
        SomeObject object = new SomeObject(5);

        Field sideField = SomeObject.class.getDeclaredField("number");
        sideField.setAccessible(true); // Allow modification of private field

        // Modify the private field, this is just a snippet.
        sideField.set(value, 10);
        System.out.println("Modified side: " + object.func());

    }
}