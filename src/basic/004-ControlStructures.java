/*
 * Control structures are used to direct (or control) the flow of a program.
 * 
 * We have several different control structures available to us, with the
 * easiest to understand being "if".
 */

package basic;

public class ControlStructures
{
	public static void main(String[] args)
	{
	  int myAge = 16;
	  String myName = "Hayden";  // change this to Ian, Naphat, Tom,
	                             // or your own name if it isn't any
	                             // of these ones.
	  int month = 1;
	  
	  boolean likeJava = true;
	  
	  if(myAge < 18)
	  {
      // if something is true, do it here.
	    System.out.println("Sorry, you must be 18 to come in here");
	  }
	  else
	  {
	    // otherwise, we do it here...
	    System.out.println("You can come in here.");
	  }
	  
	  if(myAge <= 16)
	  {
	    // <= is a way to say "less than or equals to"
	    System.out.println("You can see this movie at child prices!");
	  }
	  else
	  {
	    // if you are 17 or higher, then full price!
	    System.out.println("Adult prices for you!");
	  }
	  
	  // we can get a bit more interest things
	  // for example, if my name is Hayden
	  if(myName == "Hayden")
	  {
	    System.out.println("I like robots.");
	  }
	  // but what if I am not Hayden?
	  else if(myName == "Ian")
	  {
	    System.out.println("I like Scouts!");
	  }
	  // I could be Naphat
	  else if(myName == "Naphat")
	  {
	    System.out.println("I like software!");
	  }
	  // or Tom
    else if(myName == "Tom")
    {
      System.out.println("I make good coffee!");
    }
	  // or even Adam
	  else if(myName == "Adam")
	  {
	    System.out.println("I like stuff!");
	  }
	  // But what if I dont know? This is called a default case
	  // and will run if the above conditions are not true.
	  else
	  {
	    System.out.println("I'm still yet to know you...");
	  }
	  
	  /* Above is called if / else if / else. There is another kind
	   * called "switch". You can't use switch on Strings, but you
	   * can use it on numbers.
	   */
	  
	  switch(month)
	  {
	    case 1:
	      System.out.println("It's January.");
	    break;
	    case 2:
	      System.out.println("It's February.");
	    break;
	    case 3:
	      System.out.println("It's March.");
	    break;
	    case 4:
	      System.out.println("It's April.");
	    break;
	    default:
	      System.out.println("I'm too lazy to put the rest of the months in... "
	          + "Or maybe it is an invalid month...");
	      /* here, I was running out of space in the screen, so I did a close
	       * quote, then a + on the next line to keep it readable.
	       *
	       * Many programmers try to keep their code to a maximum of 80
	       * characters wide, in case they are on a small screen one day.
	       */
	    break;
	  }
	  
	  
	  /* Lastly, there is confusing little one called the "ternary" operator.
	   * It is a compact "if this is true return this, else return that"
	   */
	  
	  // here we are testing if likeJava is true or false.
	  System.out.println("I " + ( (likeJava)?"love":"hate" ) + " Java!");
	  /*                                      ^       ^
	   *                                      |       |
	   * true part comes first   -------------+       |
	   *                                              |
	   * false part comes second ---------------------+
	   *
	   * By putting the whole lot in extra brackets, we can keep it neat and tidy
	   * and easier to understand.
	   */
	}
}