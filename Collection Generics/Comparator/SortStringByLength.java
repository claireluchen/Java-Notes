package Comparator;

import java.util.*;

public class SortStringByLength {

	public static void main(String[] args) {
		String[] cities = {"aaaa", "cccccccc", "bbbbbb"};
		java.util.Arrays.sort(cities, new MyComparator());
		for (String s : cities) {
			System.out.println(s);
		}
		
		//since Comparator is a functional interface, use lambda expression
		java.util.Arrays.sort(cities, (s1, s2) -> s1.length() - s2.length());
		for (String s : cities) {
			System.out.println(s);
		}
		
		//can use the Comparator.comparing method to simplify further
		java.util.Arrays.sort(cities, Comparator.comparing(String::length));
		for (String s : cities) {
			System.out.println(s);
		}
	}
	
	//define custom comparator
	public static class MyComparator implements java.util.Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
		}
		
	}
	

}
