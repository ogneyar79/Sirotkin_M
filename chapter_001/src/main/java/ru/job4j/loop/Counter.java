package ru.job4j.loop;
//**
//* ������ Counter ��� ��������� ����� �����x ����� � ���������.
//*
//* @author Sirotkin.
public class Counter {
	
	/**
     *@ param int Value
     */
	int sum =0;
	
	 /**
	   * method for add sum.
       *@param start int value
	   *@param finish int value
	   */
	 public int add(int start, int finish){

        for ( int i=start;i<=finish;++i){
           if (i%2==0) {
				   sum=sum+i;
		   i=i+2;
		}
     }
			return sum;
	 }
}
