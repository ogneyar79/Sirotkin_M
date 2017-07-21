package ru.job4j.condition;
/**
* класс Triangle для нахождения площади треугольника.
*
* @author Sirotkin.
*/
public class Triangle {
	
	/**
     *a значение для вершины треугольника,переменная класса Point.
     */
  private Point a;
  
    /**
     *b значение для вершины треугольника,переменная класса Point.
     */
  private Point b;
  
    /**
     *c значение для вершины треугольника,переменная класса Point.
     */
  private Point c;
  
    /**
	  * method for setting arguments.
      *@param a Point value
	  *@param b Point value
	  *@param c Point value
	  */
   public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
    
    /**
	  * method for calculating area of a triangle.
      * @return S value
      */
  public double area() {
	  
    /**
     *s value for area of a triangle.
     */
       double s=1;
		   
  if(0.5*Math.abs((a.getX()-c.getX())*(b.getY()-c.getY())-(b.getX()-c.getX())*(a.getY()-c.getY()))!=0){
  s=0.5*Math.abs ((a.getX()-c.getX())*(b.getY()-c.getY())-(b.getX()-c.getX())*(a.getY()-c.getY()));

  }
      return s;
  }
}