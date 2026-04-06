import java.util.Date;

public class classes15ch9 {
    public static void main(String[] args) {
        //Date d = new Date();
        //System.out.println(d.toString());


        Time t = new Time(); //reate obj
        t.out(); //print out time

        Date d = t.getDate(); 

        d.setTime(100000);
        t.out();
    }
}


class Time {
    //Make all variables of class private
    private int num;
    private Date d;

    //No setter methods
    //...
    //...

    Time() { //default constructor
        num = 1;
        d = new Date();
    }

    Date getDate() { //voiding the return rule
        Date d2 = new Date(); //making na object
        d2.setTime(d.getTime()); //sets d2 time to whatever d's time is

        return d2; //this is a completely different object than the first one, so if changes made to this one, the original d wont be changed at all
    }

    void out() {
        System.out.println(d.toString());
    }

}