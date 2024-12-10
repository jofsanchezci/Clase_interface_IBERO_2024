// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("El cerdo dice: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("ZZZ-ZZZ");
  }
}

class Dog implements Animal{
  public void animalSound(){
    System.out.println("EL perro dice: gua - gua");
  }
  public void sleep(){
    System.out.println("ZZZ-ZZZ");

  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();

    Dog mydog= new Dog();
    mydog.animalSound();
    mydog.sleep();
  }
}