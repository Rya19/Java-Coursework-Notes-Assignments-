import java.io.*;
import java.util.Date;

public class Assignment06Q08 {
    public static void main(String[] args) {
        String filename = "datafile.dat";
        int[] numbers = {1, 8, 3, 4, 2};
        Date currentDate = new Date();
        double doubleValue = 5.9;
        Person person = new Person("Mark", "Brown");
        
        // Write objects to file
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))) { //allows objects to be written to file, hence name Object OUTPUT
            output.writeObject(numbers); //writes these values written above into the file
            output.writeObject(currentDate);
            output.writeDouble(doubleValue);
            output.writeObject(person);
        } 
        
        catch (IOException e) { //some error happens
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        //-------------------------------------------------------------

        // Read objects from file
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))) { //objinpstr used to read objects from file
            int[] readNumbers = (int[]) input.readObject(); //cast each object to its original type, or else java wont know numbers is an int[]
            Date readDate = (Date) input.readObject();
            double readDouble = input.readDouble();
            Person readPerson = (Person) input.readObject();
            
            // Print the read data
            System.out.println("Array of integers:");
            for (int num : readNumbers) {
                System.out.print(num + " ");
            }

            System.out.println("\nCurrent Date: " + readDate);
            System.out.println("Double value: " + readDouble);
            System.out.println("Person object: " + readPerson);

        } 
        
        catch (IOException | ClassNotFoundException e) { //if class doesnt exist
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}


class Person implements Serializable { //serizable allows writing objects to a file
    //private
    private String firstName;
    private String lastName;
    
    //public
    public Person(String firstName, String lastName) { //constructor
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    }
    public void setLastName(String lastName) { 
        this.lastName = lastName; 
    }

    public String getFirstName() { 
        return firstName; 
    }
    public String getLastName() { 
        return lastName; 
    }

    //override toString object function
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}