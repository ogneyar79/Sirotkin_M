package ru.job4j.array;
/**
 * ������ Substring ��� ���������� �������.
 *
 * @author Sirotkin.
 */

public class Substring {



    /**
     * method for cheking substringAtOrigin.
     *
     * @param origin String value
     * @param sub    String value
     *   @return the true or the false
     */
    boolean contains(String origin, String sub) {

        int count = 0;
        int goal = 0;
        char[] or = origin.toCharArray();
        char[] su = sub.toCharArray();
        for (int i = 0; i < su.length; i++) {       // cicle for sub иве,lengtch=3
            for (int j = 0 + count; j < or.length; j++) {    // cicle for origin, lengtch привет, =6
                       count++;
                if (su[i] == (or[j])) {

                       goal++;
                       count = +1;
                       break;

                }
            }
System.out.println(goal);
            if (goal == su.length) {
                return true;
            }
        }

return false;
    }
}