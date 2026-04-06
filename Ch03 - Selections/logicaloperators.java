public class logicaloperators {

    public static void main(String[] args) {
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);    

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //doesnt have criminal record
        System.out.println(isEligible);
    }
}