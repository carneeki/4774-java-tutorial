/**
 *
 * Demonstrate objects
 *
 * Note: this one one work in ideone.
 *
 */
package ObjectsExample;

public class Objects
{
  public static void main( String[] args )
  {
    Dog myDog = new Dog("Rover");
    Cat myCat = new Cat("Millie");
    Frog myFrog = new Frog("Kermit");
    
    System.out.printf("My %s is called %s. %s, speak: %s ",
      myDog.getType(), myDog.name, myDog.name, myDog.speak() );
    
    System.out.println();

    System.out.printf("My %s is called %s. %s, speak: %s ",
    	      myFrog.getType(), myFrog.name, myFrog.name, myFrog.speak() );
    
    System.out.println();    
    
    System.out.printf("My %s is called %s. %s, speak: %s ",
      myCat.getType(), myCat.name, myCat.name, myCat.speak() );
    
    System.out.println();
  }
}
