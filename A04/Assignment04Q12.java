public class Assignment04Q12 {
    public static void main(String[] args) {
        Truck t1 = new Truck(1.5, "Ford", 5);
        Truck t2 = new Truck(1.5, "Ford", 5);
        Truck t3 = new Truck(1.75, "Honda", 6);


        System.out.println(t1.toString());
        System.out.println(t3.toString());
        System.out.println(t1.equals(t3));


        System.out.println(t1.toString());        
        System.out.println(t2.toString());
        System.out.println(t1.equals(t2));
    }
}

class Vehicle {
    //Private
    private String Manufacturer;
    private int Cylinders;

    //public
    public Vehicle() {

    }

    public Vehicle(String Manufacturer, int Cylinders) {
        this.Manufacturer = Manufacturer;
        this.Cylinders = Cylinders;
    }


    public String toString() {
        return "Vehicle: Manufacturer of model: " + Manufacturer + " | " + "Cylinders of model: " + Cylinders;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //both reference same point in memory
        }
        if (obj == null || getClass() != obj.getClass()) { //if obj is null, return false or checks if the two objs belong to same class
            return false; 
        }

        Vehicle other_obj = (Vehicle) obj; //casting obj to vehicle so we can compare

        return this.Manufacturer.equals(other_obj.Manufacturer) && this.Cylinders == (other_obj.Cylinders);
    }

}

class Truck extends Vehicle {
    //Private
    private double LoadCapacity;

    //public
    public Truck() {

    }

    public Truck(double LoadCapacity, String Manufacturer, int Cylinders) {
        super(Manufacturer, Cylinders); //inheriting from superclass and getting their methods with the super() function
        this.LoadCapacity = LoadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Load Capacity: " + LoadCapacity; //getting the super's toString method and adding on to it here
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //both reference same point in memory
        }
        if (obj == null || getClass() != obj.getClass()) { //if obj is null, return false or checks if the two objs belong to same class
            return false; 
        }

        Truck other_obj = (Truck) obj; //cast Truck so we can access truck-specific stuff, if this wasnt here, we cant access loadcapac

        return Double.compare(this.LoadCapacity, other_obj.LoadCapacity) == 0 && super.equals(other_obj);
        //Compares loadcapac of thistruck and the other truck, double.compare handles this. | the super class stuff is compared to the object stuff
    }

}