package com.interviewprep.leetcode.easy.arrangingcoins;

public class FirstApproach {

	public static void main(String[] args) {
	
		int n = 8;
		
		FirstApproach fa = new FirstApproach();
		int rows = fa.arrangeCoins(n);
		
		System.out.println(rows);
		
	}

	 public int arrangeCoins(int n) {
	       
		 // the current staircase row
		 int row = 0;
		 
		 // coins left
		 int coinsLeft = n;
		 
		 while(true) {
			 
			 // subtract the row number from coins left
			 coinsLeft = coinsLeft - row;
		 	 
			 // increment row count
			 row++;
			 
			 // if coins left is less than row count then break out of the loop
			 if(coinsLeft < row) {
				 
				 break;
			 }
		 }
		 
		 return row-1;
		 
	    }
	 
}

