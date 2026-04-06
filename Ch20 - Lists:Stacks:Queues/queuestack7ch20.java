public class queuestack7ch20 {
    public static void main(String[] args) {
      String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"}; //string array
      java.util.Arrays.sort(cities, new MyComparator());
  
      for (String s : cities) {
        System.out.print(s + " ");
      }
    }
  
    public static class MyComparator implements java.util.Comparator<String> {
      @Override
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    }
  }