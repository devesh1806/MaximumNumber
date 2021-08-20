package com.maximumnumber;
import java.util.Scanner;

public class MaximumNumber {
	
	public static void intmax(Integer x, Integer y, Integer z) {
		Integer max = Integer.MIN_VALUE;
		if ( x.compareTo(y) == 1 ) {
			max = x;
			if ( z.compareTo(max) == 1 ) {
				max = z;
			}
		}
		else {
			max = y;
			if ( z.compareTo(max) == 1 ) {
				max = z;
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		//UC1 - checking maximum of 3 numbers
		Integer x= 2 ; Integer y= 4 ; Integer z= 7;
		intmax(x,y,z);
	}
}
