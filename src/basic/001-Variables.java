/*
 * Demonstrate variables in a couple of examples.
 *
 */
package basic;
class Variables
{
  public static void main( String[] args )
  {
    String myName = "Dave";  // change this to be your name.
    
      /*
       * A variable is like an "x" in algebra. It is a container which has a
       * value.
       *
       * A string is a bunch (or "String") of letters, such as a name.
       */

    String pcName = "Hal";   // leave this one
    String pcModel = "9000"; // and this one.
    
    System.out.println("Hello, my name is " + pcName); // A simple example.
      /* 
       * We want to println() some text, followed by a variable. In this case
       * the computer prints out its name
       */
    
    System.out.println(); // Let's add a few lines of space.
    System.out.println();
    
    
    System.out.println("I'm sorry, I can do that for you, " + myName);

    System.out.println(); // some more space
    System.out.println();
    
    
    System.out.printf("I am a %s %s.\n", pcName, pcModel);
      /* 
       * this line is interesting, a couple of things are going on here.
       * firstly, we're using printf() instead of println()
       *
       * printf is the "Print formatter". You can use it to throw several
       * variables in a single print out.
       *
       * It takes three inputs (called arguments). The first is the "format
       * string". This is what we would like to output, formatted.
       * The %s means we would like to substitute a "String" in here.
       *
       * The remaining arguments are the parts to be added to the format string.
       * In this case they are the computer's name and model.
       */
  }
}
