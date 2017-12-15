package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertList {
    private int cizeA;
    private int cizeB;
    public int rows;
    public int cells;
    List<Integer> listLoop = new ArrayList<Integer>();


    public ConvertList(int cizeA, int cizeB) {
        this.cizeA = cizeA;
        this.cizeB = cizeB;
    }
   public int array2 [][];

    /**
     *
     * @return
     */
        public int[][] fill () {
        int number = 0;
        int cizeA = this.cizeA;
        int cizeB = this.cizeB;
        int [][] array = new int[cizeA][cizeB];
        for (int i = 0; i < cizeA; i++) {
            for (int j = 0; j < cizeB; j++){
                array[i][j] = number++;
                System.out.println(array [i][j]);
            }
        }
        array2 = array;
        return  array2;
    }


    public List<Integer> toList (int[][] array2) {
        List<Integer> listLoop = new ArrayList<Integer>();
        this.array2 = array2;
        int counter = 0;
        Integer []array1 = new Integer[cizeA * cizeB];
        for (int i = 0; i < cizeA; i++) {
            for ( int j = 0; j < cizeB; j++) {
                       array1[counter] = array2[i][j];
                       counter++;
            }
        }

        listLoop = Arrays.asList(array1);

        return listLoop;
    }

    /**
     *
     * @param list
     * @param rows
     * @return
     */
    public int[][] toArray (List<Integer> list, int rows) {

    List<Integer> listForConvert = new ArrayList<>();
        listForConvert = list;
                  int cizeLoop = listForConvert.size();
        int [] loopForList = new int [cizeLoop];
        int i = 0;
        for (Integer n : listForConvert) {
            loopForList[i++] = n;
        }
        if (cizeLoop % rows == 0) {
            int q = 0;
            int cells = cizeLoop/rows;
            int [][] array2 = new int[rows][cells];
            for ( i = 0; i < rows; i++) {
                for (int j = 0; j < cells; j++) {
                       array2 [rows][cells] =   loopForList[q++];
                }
            }
        } else {
                 int q = 0;
            int partRows = cizeLoop / rows;
           int newCizeLoop = partRows * rows + rows;
            int cells = newCizeLoop / rows;
            array2 = new int[rows][cells];
            for ( i = 0; i < rows; i++) {
                for (int j = 0; j < cells - (newCizeLoop - cizeLoop); j++) {
                       array2 [rows] [cells] = loopForList [q++];
                }
            }
        }

            return  array2;
    }


    public static void main (String[] args) {
        ConvertList forFiling = new ConvertList(4, 4);
                forFiling.fill();
             forFiling.array2 = forFiling.toArray(forFiling.listLoop, 4);
        for ( int i = 0; i < forFiling.array2.length; i++) {
            for ( int j = 0; j < forFiling.array2[i].length; j++) {
                System.out.print(forFiling.array2 [i][j]);

            }
            System.out.println("");
        }
    }
}
