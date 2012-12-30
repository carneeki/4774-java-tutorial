/**
 *
 * Demonstrate objects
 *
 * Note: this one one work in ideone.
 *
 */
package ObjectsExample;

public class Cat extends Animal
{
  Cat(String name)
  {
	super(name);
    _setType("cat");
  }
  
  public String speak()
  {
    String output="";
    for(int i=0; i<3; i++)
    {
       output = output + ((i!=2)?"Nyan! ":"Nyan!");
    }
    
    return output;
  }
}
