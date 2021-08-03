/**
 * H4P1 is a program that solves encrypted puzzles, where letters represent numbers.
 * 
 * Method "puzzle" solves the homework task and method "antHill" is an additional
 * encryption that I created myself to test and learn if the code works as intended.
 * Both puzzle and antHill are tested in the main method.
 *
 * @author  Agne Januskeviciute
 * @version 2020-02-08
 */
public class H4P1
{
    public static void main (String[] args)
    {

        System.out.println("Checking TOO+TOO+TOO+TOO=GOOD solutions:");
        puzzle(); //Calling the puzzle method to print its  solutions
        
        System.out.println("Checking solutions for a new puzzle - ANT+ANT+ANT+ANT=HILL:");
        antHill(); //Calling the antHill method to show all the solutions to the encryption
    }
    
    /**
     * In this "puzzle" method I solved the homework task "TOO + TOO + TOO + TOO = GOOD".
     * After attempting to solve it myself I used this example to learn what 
     * I could do better:
     * @link https://stackoverflow.com/questions/17893193/java-program-to-solve-simple-cryptarithmetic-puzzle
     * 
     * @param int t, o, g, d
     */
    public static void puzzle()
    {
      // Each for loop involves the next letter, starting with "t" as it is the first in the puzzle.
      for (int t = 0; t <10; t++)   
      {
        for (int o = 0; o <10; o++)
        {
          for (int g = 0; g <10; g++)
          {
            for (int d = 0; d <10; d++)
            {   
              //The following if statement catches the values of letters
              if ((d == g) || (d == o) || (d == t) || (g == o) || (g == t) || (o == t))
              {
                continue; //continue exits only the existing 'if', and I do not want letters to equal to each other
              }
              //Else if specifies the location of letters. If the letters do not equal to one another, else if is activated
              else if (4 * ( 100 * t + 10 * o + o) == 1000 * g + 100 * o + 10 * o + d)
              {
                //Separate print functions to shorten the code and avoid the addition that happens if "" is ommited
                System.out.print(" T = " + t);
                System.out.print(" O = " + o);
                System.out.print(" G = " + g);
                System.out.print(" D = " + d);
                System.out.println(); //New line to separate solutions
              }
            }
          }
        }   
      }
    }
    
    /**
     * Additional method to test the for loops and see if it includes more than 
     * two solutions that "TOO + TOO + TOO + TOO = GOOD" has.
     * 
     * Method andHill solves "ANT+ANT+ANT+ANT=HILL" and provides all the solutions.
     * 
     * @param int a, n, t, h, i, l
     */
    public static void antHill()
    {
      //Loops for each letter:
      for (int a = 0 ;  a < 10 ; a++)   
      {    
        for (int n = 0 ; n < 10 ; n++)  
        {    
          for (int t = 0 ; t < 10 ; t++) 
          {    
            for (int h = 0 ; h <10 ; h++)
            {  
              for (int i = 0 ; i <10 ; i++)
              { 
                for (int l = 0 ; l <10 ; l++)
                { 
                  /*If function to catch the letters that I do not want to equate for the solutions.
                   * I did two else ifs to shorten the code because the variety of letters make up
                   * a very long if statement.
                   */
                  if ((a == n)||(a == t)||(a == h)||(a == i)||(a == l)||(n == t)||(n == h)||(n == i) || (n == l))
                  {
                    continue; //exit ONLY this if statement
                  }
                  else if ((t == h)|| (t == i) || (t == l) || (h == i)|| (h == l)) //Remaining letters
                  {
                    continue; //exit ONLY this else if statement
                  }
                  else if (4*(100*a + 10*n + t) == 1000*h + 100*i + 10*l + l)
                   {      
                     System.out.print(" A = " + a);
                     System.out.print(" N = " + n);  
                     System.out.print(" T = " + t); 
                     System.out.print(" H = " + h);  
                     System.out.print(" I = " + i); 
                     System.out.print(" L = " + l);
                     System.out.println(); //This way the solution prints in a nice block and starts from a new line
                  }
                }
              }
            }
          } 
        }
      }   
    }
}
