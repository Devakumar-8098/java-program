class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

// subclass
class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

// main class
public class Main {
   public static void main(String args[]) {
      Animal animal = new Animal(); // create an Animal object
      Dog dog = new Dog(); // create a Dog object

      animal.move(); // calls the method in Animal class
      dog.move(); // calls the method in Dog class
   }
}
