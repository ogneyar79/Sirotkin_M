package ru.job4j.condition;
/**
* класс Point для описания точки в системе координат.
*
* @author Sirotkin.
*/
public class Point {

	/**
     *@ param a value for our function
     *@ param b value for out function
     */
	   int a;
	   int b;

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
      * @param  get int value
	  * @return this.x
	  */
    public int getX() {
      return this.x;
  }

     /**
	  * method for geting argument y for class Point.
	  * @param get int value
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
     	if (y == a * x + b) {
			return true;
		} else {
          return false;
		}
  }

}