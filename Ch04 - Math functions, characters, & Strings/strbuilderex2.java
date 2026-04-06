public class strbuilderex2 {

    public static void main(String[] args) {
        String[] words_array = {"hello", "my", "name", "is", "rya"};

        StringBuilder sb_obj1 = new StringBuilder();

        for (String words : words_array) {
            sb_obj1.append(words).append(" "); //appends the words in array and adds a space after each word
        }

        //"quality of life" code lines --v
        sb_obj1.deleteCharAt(sb_obj1.length() - 1); //deletes extra space at the end
        sb_obj1.setCharAt(0, Character.toUpperCase(sb_obj1.charAt(0))); //sets first letter in string array to a captial letter



        int index = sb_obj1.indexOf("rya"); //searches for first occurance of this string inside the sb object and returns its starting position
        if (index != -1) {
            sb_obj1.replace(index, index + "rya".length(), "Rya"); //start at index 0, end at the index + the length of the string you wanna replace, insert the string you want
        }

        StringBuilder reverse_str = new StringBuilder(sb_obj1).reverse();

        System.out.println(sb_obj1.toString());
        System.out.println(reverse_str.toString());

    }
}