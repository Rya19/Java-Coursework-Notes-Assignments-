import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;


public class Lab03HS {
    public static void main(String[] args) {
        DataContainer DC_array1 = new DataContainer(5);

        DC_array1.InitializeArrays();
        DC_array1.PrintContainer();

        System.out.println("BigInteger Mean: ");
        System.out.println(DC_array1.BigIntegerMean());

        System.out.println("BigDecimal Mean: ");
        System.out.println(DC_array1.BigDecimalMean());

        System.out.println("Longest String: ");
        System.out.println(DC_array1.getLongestString());
    }
}


class DataContainer {
    //Private
    private int array_size;
    private StringBuilder[] SB_array;
    private BigInteger[] BI_array;
    private BigDecimal[] BD_array;
    
    //Public
    public DataContainer(int array_size) {
        this.array_size = array_size;
        SB_array = new StringBuilder[array_size];
        BI_array = new BigInteger[array_size];
        BD_array = new BigDecimal[array_size];
    }

    private String generateRandomString() {
        String all_Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //stores all known characters here
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int Random_str_size = random.nextInt(20 - 5) + 5;

        for (int i = 0; i < Random_str_size; i++) {
            sb.append(all_Characters.charAt(random.nextInt(all_Characters.length())));
        }
        return sb.toString();
    }

    public void InitializeArrays() {
        Random rand1 = new Random();
        //String all_Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //stores all known characters here

        for (int i = 0; i < BI_array.length; i++) {
            int Random_Int = rand1.nextInt(1000); 
            BI_array[i] = new BigInteger(Random_Int + "");
        }

        for (int i = 0; i < BD_array.length; i++) {
            double Random_Double = rand1.nextDouble(1.0);
            BD_array[i] = new BigDecimal(Random_Double + "");
        }

        for (int i = 0; i < SB_array.length; i++) {
            //int Random_Char_Index = rand1.nextInt(all_Characters.length()); 
            SB_array[i] = new StringBuilder().append(generateRandomString());
        }
    }

    public void PrintContainer() {
        for (int i = 0; i < BD_array.length; i++) {
            System.out.print(BD_array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < BI_array.length; i++) {
            System.out.print(BI_array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < SB_array.length; i++) {
            System.out.print(SB_array[i] + " ");
        }
        System.out.println();

    }

    public BigInteger BigIntegerMean() {
        BigInteger BI_total = new BigInteger("0");
        BigInteger BI_mean = new BigInteger("0");

        for (int i = 0; i < BI_array.length; i++){
            BI_total = BI_total.add(BI_array[i]);
        }

        return BI_mean = BI_total.divide(BigInteger.valueOf(array_size));
    }

    public BigDecimal BigDecimalMean() {
        BigDecimal BD_total = new BigDecimal("0");
        BigDecimal BD_mean = new BigDecimal("0");

        for (int i = 0; i < BD_array.length; i++){
            BD_total = BD_total.add(BD_array[i]);
        }

        return BD_mean = BD_total.divide(BigDecimal.valueOf(array_size));
    }

    public String getLongestString() {
        String longest = "";
        for (StringBuilder sb : SB_array) {
            if (sb.length() > longest.length()) {
                longest = sb.toString();
            }
        }
        return longest;
    }
}