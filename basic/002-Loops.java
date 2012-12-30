/*
 * Demonstrate loops in a couple of examples.
 *
 */
class Loops
{
  public static void main( String[] args )
  {
    int i = 0; // variables can be numbers, not just Strings.
      /*
       * In fact, this type of number is called an integer. It is a whole number
       * (ie, it is not a fraction like 0.5 or 1/2).
       */
    
    while(i <= 10)
    {
      // while the variable i is less than or equal to 10
      // do some stuff in the swirly braces
      
      System.out.println("i = " + i); // let's just println() the counter
      
        /*
         * We also need to increase the counter, otherwise, i will ALWAYS be
         * less than!
         */
      
      
      i++; // the "++" means "increment the counter". 
           /*
            * there are other ways to do it, for example we could write
            *
            *  i = i + 1;
            *
            * Which is perfectly valid! It's just that i++; is a nice shorthand
            */


    } // while(i<=10)   // for long blocks of code, I like to put a small
                        // comment at the ending brace to say where it matches
                        // up to..
    
    System.out.println(); // create a few lines of empty space to separate
    System.out.println(); // the two examples
    System.out.println();
    
    // this next example does exactly the same thing but puts it all in one line
    // my preference is to use for() loops because they're pretty compact
    for(int j = 0; j <= 10; j++)
    {
      System.out.println("j = " + j);
    }
  }  // public static void main()
} // class loops
