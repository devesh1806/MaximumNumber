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
	
	public static void floatmax(Float x, Float y, Float z) {
		Float max = Float.MIN_VALUE;
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
	
	public static void stringmax(String x, String y, String z) {
		String max = "";
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
		Integer x = 2 ; Integer y = 4 ; Integer z = 7;
		intmax( x , y , z );
		
		//UC2 - checking maximum of 3 floats
		Float x1 = 8.2f ; Float y1 = 7.5f ; Float z1 = 6.5f;
		floatmax( x1 , y1 , z1 );
		
		//UC3 - checking maximum of 3 strings
		String x2 = "Apple" ; String y2 = "Peach" ; String z2 = "Banana" ;
		stringmax( x2 , y2 , z2 );
	}
}
