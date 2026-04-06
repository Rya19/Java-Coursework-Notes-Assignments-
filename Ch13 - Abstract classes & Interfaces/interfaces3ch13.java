
public class interfaces3ch13 {
    public static void main(String[] args) {
        
        Object[] object_list = {new Tiger(), new Chicken(), new Apple(), new Orange()};

        for (int i = 0; i < object_list.length; i++) {
            if (object_list[i] instanceof Edible) { 
                System.out.println(((Edible)object_list[i]).howToEat());
            }

            if (object_list[i] instanceof Animal) {
                System.out.println(((Animal)object_list[i]).sound());
            }
        }

    }
}

//--------------------------------------------------

abstract class Animal {
    private double weight;

    public double getWeight() { //get func
        return weight;
    }

    public void setWeight(double weight) { //constructor 
        this.weight = weight;
    }

    public abstract String sound(); //concrete class for other classes to change
    
}

class Tiger extends Animal { //tiger inherits animal functions, and overrides the sound function
    @Override
    public String sound() {
        return "Tiger: Meow";
    }
}

interface Edible {
    public abstract String howToEat(); //a function for classes to override 
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() { //overrides howtoeat function from edible interface
        return "Chicken: Fry it!";
    }

    @Override
    public String sound() { //ovverides sound function from animal class
        return "Chicken: *chicken noises*";
    }
}


abstract class Fruit implements Edible {
    //stuff here
}

class Apple extends Fruit { //nothing is in fruit, but we know that we have to ovveride the howtoeat interface
    @Override
    public String howToEat() {
        return "Apple: eat it";
    }

}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: peel";
    }
}



