/**
 *
 * Demonstrate objects
 *
 * Note: this one one work in ideone.
 *
 */
package ObjectsExample;

public class Dog extends Animal
{
  Dog(String name)
  {
    super(name);
    _setType("dog");
  }
  
  public String speak()
  {
    return "Woof!";
  }
}
