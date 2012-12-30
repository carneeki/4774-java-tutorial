/*
 * Demonstrate functions in a couple of examples.
 *
 */
class myFunctions
{
  /*
   * this is a function.
   * it is called addOne because it will 'add one' to whatever we feed it
   * as an argument.
   *
   * it has a type int, because it will always return an integer.
   *
   * the input also has a type int because we always want to expect an integer
   */
  public static int addOne(int input)
  {
    int output = input++;
    return output;  // here is where the output comes out
  }
  
  /*
   * this is a similar example, except it multiplies by 2
   */
  public static int timesTwo(int input)
  {
    return (input * 2); // and we don't need the output variable
  }
  
  /**
   * here's an example with multiple inputs
   *
   * You'll also notice I'm starting to become more funky with the comments.
   * This one started with /** because it follows a special format. Paramaters
   * and return values are given as follows. This format is called JavaDoc and
   * many pieces of software can create nice HTML documentation based on this
   * style of comment. Use it! :D
   * @param int input  a number
   * @param int n      a number we would like to multply by
   * @return int
   */
  public static int timesN(int input, int N)
  {
    return (input * N);
  }
  
  public static void main( String[] args )
  {
    for(int i = 0; i <= 10; i++)
    {
      System.out.printf("input: %d, function: addOne(), output: %d\n"  , i, myFunctions.addOne(i) );
      System.out.printf("input: %d, function: timesTwo(), output: %d\n", i, myFunctions.timesTwo(i) );
      System.out.printf("input: %d, function: timesN(), output: %d\n"  , i, myFunctions.timesN(i,i) );
      System.out.println();
    }
  }  // public void main()
} // class loops
