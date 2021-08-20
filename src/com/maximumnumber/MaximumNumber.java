package com.maximumnumber;

public class MaximumNumber {
	
	
	public static <E extends Comparable<E>> void testMaximum(E x, E y, E z) {
		E max = x;
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
		
		Integer x = 2 ; Integer y = 4 ; Integer z = 7;
		testMaximum( x , y , z );
		
		Float x1 = 8.2f ; Float y1 = 7.5f ; Float z1 = 6.5f;
		testMaximum( x1 , y1 , z1 );
		
		String x2 = "Apple" ; String y2 = "Peach" ; String z2 = "Banana" ;
		testMaximum( x2 , y2 , z2 );
	}
}
