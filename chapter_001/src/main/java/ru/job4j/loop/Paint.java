package ru.job4j.loop;
/**
* ������ Paint ��� ��������� ��������.
*
* @author Sirotkin.
*/
public class Paint {
	
	
	  /**
	    * method for making piramid.
        *@param h int value showing height our Piramid
	    */
	public String piramid (int h) {


// h=2; w=3;m=1


        double w = 2 * h - 1;


        double m = w / 2 - 0.5;   // index for midle of width piramid for each cicle


        StringBuilder myPiramid = new StringBuilder();


        for (double i = 0; i < h; ++i) {

            for (double j = 0; j < w; ++j) {
                if ((j >= (m - i)) && (j <= (m + i))) {
                    myPiramid.append("^");
                } else if (j == m) {
                    myPiramid.append("^");
                } else {

                    myPiramid.append(" ");


                }

            }

            myPiramid.append(System.getProperty("line.separator"));
        }
        return myPiramid.toString();
        }
    }