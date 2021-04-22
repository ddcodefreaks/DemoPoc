package com.restful.webservices.restfulwebservices.poc.arraylistpoc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * lambda expression works only with single abstract method interface called functional interface.
 * Lambda expressions are faster than the Anonymous classes as they are only executed when they are called.
 * @author dev_bhaskar
 *
 */
public class LambdaExpressionPoc {
	
	/**
	 * find the minimum value in array using stream 
	 * @param args
	 */
	
	public  static void whenArrayIsOfIntegerThenMinUsesIntegerComparator() {
	    int[] integers = new int[] { 20, 98, 12, 7, 35 };
	    
	    int min = Arrays.stream(integers)
	      .min()
	      .getAsInt();
	    
	    System.out.println("** Minimum value::"+ min);

	}
	
	/**
	 * iterate over  map
	 * @param args
	 */
	public static void iterateMapStreamAPI() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "red");
		map.put(1, "blue");
		map.put(1, "green");
		map.put(1, "yellow");
		map.put(1, "pink");
		
	    map.entrySet().stream()
	      .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}
	
	
	public static void main(String[] args) {
		
		whenArrayIsOfIntegerThenMinUsesIntegerComparator();
		iterateMapStreamAPI();

		// start a thread by lambda expression
		Runnable runnable = () -> System.out.println("Lambda Expression");
		Thread thread = new Thread(runnable);
		thread.start();
		 
	}

}
