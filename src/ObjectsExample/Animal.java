/**
 *
 * Demonstrate objects
 *
 * Note: this one one work in ideone.
 *
 */
package ObjectsExample;

public class Animal
{
  public  String name;
  private String type;
  
  Animal(String name)
  {
    this.name = name;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  protected void _setType(String type)
  {
    this.type = type;
  }
  
  public String speak()
  {
    return "I have no voice!";
  }
}
