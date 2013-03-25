import java.util.Scanner;

// Insert any necessary import statements here.


public class AreaRectangle
{
  private Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args)
  {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      
      
      System.out.print("\n");

      // Get the rectangle's length from the user.
      length = getLength();
      // Get the rectangle's width from the user.
      
      width = getWidth();

      // Get the rectangle's area.
      area = length * width;
      

      // Display the rectangle data.
      System.out.println("lenght= "+ length); 
      System.out.print("width= "+ width);
      System.out.print("area= "+ area);
      
  }

  /**
   * Asks the user for the length and returns that value as a double
   *
   * @return the length of the rectangle as a double
   */
  private static double getLength()
  {
      System.out.print("what is the length?: ");
      return keyboard.nextDouble();
  }
  
  
  
  
  
  /**
   * Asks the user for the width and returns that value as a double
   *
   * @return the width of the rectangle as a double
   */
  private static double getWidth()
  {
      System.out.print("what is the width?: ");
      return keyboard.nextDouble();
  }
  
  
  
  /**
   * Takes the length and width as input, multiplies them, and
   * returns the result as the area
   *
   * @param  length  the length of the rectangle as a double
   * @param  width  the width of the rectangle as a double
   * @return the area of the rectangle as a double
   */

  
  
  
  
  /**
   * Displays the length, width, and area of the rectangle rounded
   * to two decimal places.
   *
   * @param  length  the length of the rectangle as a double
   * @param  width  the width of the rectangle as a double
   * @param  area  the area of the rectangle as a double
   */

}