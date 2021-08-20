package com.maximumnumber;

public class MaximumNumber <E extends Comparable<E>> {
	
	E x , y , z , w ;
	
	public MaximumNumber(E x, E y, E z , E w) {
		this.x = x ;
		this.y = y ;
		this.z = z ;
		this.w = w ;
	}
	
	public void testMaximum() {
		testMaximum(x, y, z, w);
	}
	public static <E extends Comparable<E>> void testMaximum(E x, E y, E z, E w) {
		E max = x;
		if ( x.compareTo(y) == 1 ) {
			max = x;
			if ( z.compareTo(max) == 1 ) {
				max = z;
				if ( w.compareTo(max) == 1 ) {
					max = w;
				}
			}
		}
		else {
			max = y;
			if ( z.compareTo(max) == 1 ) {
				max = z;
				if ( w.compareTo(max) == 1 ) {
					max = w;
				}
			}
		}
		printMax( x , y , z , w , max );
	}
	
	//UC5 - created printMax which is internally called in testMaximum
	public static <E> void printMax( E x , E y , E z , E w , E max) {
		System.out.println("The maximum of " + x + " , " + y + " , " + z + " , " + w + " is " + max + " .");
	}
	
	
	public static void main(String[] args) {
		
		//UC4 done below by adding more than 3 parameters
		
		//UC 1-3 and Refractor 1 -- created just generic method 
		Integer x = 2 ; Integer y = 4 ; Integer z = 7; Integer w = 11;
		testMaximum( x , y , z , w);
		
		Float x1 = 8.2f ; Float y1 = 7.5f ; Float z1 = 6.5f; Float w1 = 2.6f;
		testMaximum( x1 , y1 , z1 , w1);
		
		String x2 = "Apple" ; String y2 = "Peach" ; String z2 = "Banana" ; String w2 = "Orange" ;
		testMaximum( x2 , y2 , z2 , w2);
		
		//Refractor 2 - created class generic and parameterized constructor
		new MaximumNumber(x, y, z, w).testMaximum();
		new MaximumNumber(x1, y1, z1, w1).testMaximum();
		new MaximumNumber(x2, y2, z2, w2).testMaximum();
	}
}
