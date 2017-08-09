/*package ru.job4j.loop;*/
/*
 ������ Board ��� ��������� ��������� �����.

 @author Sirotkin.
*/


//public class Board {
//
//String result = " ";
//
///**
//* method for paint board.
//*@param width int value
//*@param height int value
//
 /*public String paint(int width, int height) {

StringBuilder board = new StringBuilder();

for (int i = 0;i<height;++i) {
	for (int j=0;j<width;++j) {
		
		if ((i+j)%2 == 0) {
			
			board.append("+");
		}
		
		else {
			board.append(" ");
		}
		
	}
		board.append(System.getProperty("line separator"));
	}
	
	    return board.toString(); /*
}
}*/