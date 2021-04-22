package com.restful.webservices.restfulwebservices.poc.arraylistpoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.el.stream.Optional;

public class ArrListDemo1 {
	
	
	/**
	 * create a method Write a Java program to create a new array list, add some colors (string) and print out the collection
	 * @param args
	 */
	
	public static void addColors() {
		List<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("White");
		
		// ways to iterate over list
		/*System.out.println(colors);
		for (String element : colors) {
			System.out.println(element);
		}
		colors.stream().forEach(obj-> System.out.println(obj));
		colors.stream().forEach(System.out::println);*/
		colors.forEach(System.out::println);
		
	}
	
	/**
	 * Write a Java program to insert an element into the array list at the first position
	 * @param args
	 */

	public static  void insertFirstPosition() {
		List<String> insert= new ArrayList<>();
		insert.add(0, "First Position");
		insert.stream().forEach(System.out::println);
		System.out.println(insert.get(0)); //Write a Java program to retrieve an element (at a specified index) from a given array list. 
		insert.set(0, "first position updated");
		insert.stream().forEach(System.out::println); //Write a Java program to update specific array element by given element.
	}
	
	/**
	 * Write a Java program to search an element in a array list.
	 * @param args
	 */
	
	public static void searchForElement() {
		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("White");
		
		String colorname= colors.stream().filter(obj-> obj.equals("Red")).findAny().orElse(null);
		System.out.println(colorname);
	}
	
	/**
	 * write  a java program to find the distinct element in array list  by java 8
	 * @param args
	 */
	
	public static void findDistinct() {
		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("White");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("White");
		
		List<String> distinctColors = colors.stream().distinct().collect(Collectors.toList());
		distinctColors.stream().forEach(System.out::println);
		
	}
	
	/**
	 * create a method to sort arraylist into ascending order 
	 * @param args
	 */
	
	public static void  sortingList(){
		
		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("White");
		
		Collections.sort(colors);
		System.out.println("**********Sorting in ascending order*****************");
		colors.stream().forEach(System.out::println); // sorting in ascending order 
		
		Collections.sort(colors,Collections.reverseOrder());
		System.out.println("**********Sorting in revesre order*****************");
		colors.stream().forEach(System.out::println); // sorting in ascending order 
		
	}
	
	public static void main(String[] args) {
		addColors();
		//insertFirstPosition();
		//searchForElement();
		//findDistinct();
		//sortingList();
		
	}

}
