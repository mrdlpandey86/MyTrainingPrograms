package com.core.Array;

public class multidimensionalArray {
	
	 public static void main(String[]args) {
		 
		 
	int	 multi[][]= new int[3][3];
	 			
	 multi[0][0]= 10;
	 multi[0][1]= 20;
	 multi[0][2]= 30;
	 multi[1][0]= 40;
	 multi[1][1] = 50;
	 multi[1][2]= 60;
	 multi[2][0]= 70;
	 multi[2][1]= 80;
	 multi[2][2]= 90;
	  
	for(int[] x: multi) {         // for each loop
		for(int y:x) {
	
		 System.out.println(y);
	}
	}
	//for loop 
	
	
	// for(int x=0; x< multi.length;x++) {
	//(int y=0;y <multi[0].length;y++) {
	//		 System.out.println(multi[x][y]);
	// }
	 
	// System.out.println("*******************************");
	// }
	 }
}