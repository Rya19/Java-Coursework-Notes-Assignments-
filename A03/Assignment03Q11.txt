public class Assignment03Q11 {

    public static void main(String[] args) {
        


    }
}

class MyStringBuilder {
    //PRIVATE
    private char[] arr_of_chars; //data
    private int size;
    private int capacity;

    //PUBLIC
    public MyStringBuilder(String s) {
        this.capacity = s.length();
        this.size = s.length();
        arr_of_chars = new char[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            arr_of_chars[i] = s.charAt(i); //puts each character of string into char array
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public String geString() {
        return new String(arr_of_chars, 0, size); //Method takes array, starting index, and the size and combines it into a complete string
    }

    public MyStringBuilder append(MyStringBuilder user_obj) {
        int upd_size = this.size + user_obj.size; //the objects (the obj that is calling this func) size will be grabbed and the object being passed to this function

        if (upd_size > arr_of_chars.length) {
            char[] Temp_Array = new char[upd_size * 2]; //create a temp array that has double the size

            System.arraycopy(arr_of_chars, 0, Temp_Array, 0, upd_size); // copy array of object that is calling the func and put into temp

            arr_of_chars = Temp_Array; //new array now temp array
        }

        //else (?)
            System.arraycopy(user_obj.arr_of_chars, 0, arr_of_chars, size, user_obj.size); //takes obj array start at pos 0, copy elem from calling obj char array, starting from size, and grabs num of elem to copy from it

            size = upd_size;

            return this;
    }

    public MyStringBuilder substring (int start, int end) {
        MyStringBuilder temp_obj = new MyStringBuilder(""); //empty string or else not work

        temp_obj.size = end - start;
        temp_obj.arr_of_chars = new char[temp_obj.size];

        System.arraycopy(this.arr_of_chars, start, temp_obj.arr_of_chars, 0, temp_obj.size);

        return temp_obj;
    }

}