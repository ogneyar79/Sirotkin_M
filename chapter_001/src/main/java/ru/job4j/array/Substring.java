package ru.job4j.array;
/**
 * ������ Substring ��� ���������� �������.
 *
 * @author Sirotkin.
 */


public class Substring {
    String origin;
    String sub;
    char[]or;
    char su;
    boolean result;
    int stResult;

    /**
     * method for cheking substringAtOrigin.
     *@param origin String value
     *@param  sub String value
     */
    boolean contains (String origin,String sub) {
        this.origin=origin;
        this.sub=sub;
        char[]or=origin.toCharArray();
        char[]su=sub.toCharArray();
        for  (int i =0; i < or.length; i++) {
            for (int j = 0; j < su.length; j++) {

                if (su[j]==(or[i])) {
                    boolean result = true;
                    return result;
                } else {
                    boolean result = false;
                }
            }
        }
        return result;
    }

}