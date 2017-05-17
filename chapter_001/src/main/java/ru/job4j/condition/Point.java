package ru.job4j.condition;
/**
* класс Point для описания точки в системе координат.
*
* @author Sirotkin.
*/
public class Point {

	/**
     *x value for our function.
     */
	  private int x;

	/**
	  *y value for out function.
	 */
	  private int y;

     /**
	   * method for geting arguments.
       *@param x int value
	   *@param y int value
	   */
    public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

     /**
      * method for geting argument x for class Point.
      * @ getX get int value
	  * @return this.x
	  */
    public int getX() {
      return this.x;
  }

     /**
	  * method for geting argument y for class Point.
	  * @ getY get int value
	  * @return this.y
	  */
    public int getY() {
     return this.y;
  }

     /**
	   * method for determining if point lay on the function(y(x) = a * x + b).
       * @param  a get int value at our function
	   * @param b get int value at our function
	   * @return true or false
       */
    public boolean is(int a, int b) {
     	return y == a * x + b;
}
 }