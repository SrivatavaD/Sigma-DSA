public class OOPSfour {

    public static void main(String[] args) {
        Horse H = new Horse();
        H.eat();
        H.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
        
    }
    
}

abstract class Animal {
    void eat () {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk () {
        System.out.println("Walks on 4 legs");
    }

}

class chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
