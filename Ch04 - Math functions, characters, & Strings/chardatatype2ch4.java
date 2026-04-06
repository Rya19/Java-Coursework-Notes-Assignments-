public class chardatatype2ch4 {

    public static void main(String[] args) {
        double price = 11.23;

        System.out.printf("The price is %.2f", price); //printf is for formatting | can have regular strings in format parameter | .2 is for rounding to 2 digits (or 3)
        System.out.printf("The price is %.0f%%", price); //wrap your format with % so you can print stuff after that
    }
}