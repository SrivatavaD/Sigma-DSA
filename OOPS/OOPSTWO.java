public class OOPSTWO {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        bird dobby = new bird ();
        dobby.eat();
        dobby.fly();
        System.out.println("eat");
        

    }
    
}

// base class

class Animal{
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe () {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    // int legs;
    void walk() {
        System.out.println("Walks");
    }
}
class fish extends Mammal {
    // String breed;
    void swim() {
        System.out.println("swim");
    }
}

class bird extends Mammal {
    void fly(){
        System.out.println("Fies");
    }
}

//Derived Class 
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");

//     }
// }
