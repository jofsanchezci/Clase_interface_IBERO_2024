// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("ZZZ-ZZZ");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("El cerdo dice: wee wee");
  }
}

class Dog extends Animal{
  public void animalSound(){
    System.out.println("El perro dice: gua gua");
  }

}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
    Dog mydog= new Dog();
    mydog.animalSound();
    mydog.sleep();
  }
}