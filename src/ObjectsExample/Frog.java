/**
 *
 * Demonstrate objects
 *
 * Note: this one one work in ideone.
 *
 */
package ObjectsExample;
public class Frog extends Animal
{
  Frog(String name)
  {
    super(name);
    _setType("frog");
  }
  
  public String speak()
  {
    return "Ribbit!";
  }
}
