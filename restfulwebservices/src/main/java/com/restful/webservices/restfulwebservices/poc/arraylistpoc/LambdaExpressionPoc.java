package com.restful.webservices.restfulwebservices.poc.arraylistpoc;

import java.util.Arrays;
import java.util.Map;

/**
 * lambda expression works only with single abstract method interface called functional interface.
 * With Lambda expression compiler will create only 1 class file as below.
 * Lambda expressions are faster than the Anonymous classes as they are only executed when they are called.
 * @author dev_bhaskar
 *
 */
public class LambdaExpressionPoc {
	
	/**
	 * find the minimum value in array
	 * @param args
	 */
	
	public  static void whenArrayIsOfIntegerThenMinUsesIntegerComparator() {
	    int[] integers = new int[] { 20, 98, 12, 7, 35 };
	    
	    int min = Arrays.stream(integers)
	      .min()
	      .getAsInt();
	    
	    System.out.println("** Minimum value::"+ min);

	   // assertEquals(7, min);
	}
	
	/**
	 * iterate over  map
	 *
	 * @param args
	 */
	public void iterateUsingStreamAPI(Map<String, Integer> map) {
	    map.entrySet().stream()
	      // ...
	      .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}
	
	public static void main(String[] args) {
		
		// start a thread by lambda expression
		
		/*Runnable runnable = ()-> System.out.println("Lambda Expression");
		
		Thread thread = new Thread(runnable);
		thread.start();*/
		
		whenArrayIsOfIntegerThenMinUsesIntegerComparator();
	}

}
