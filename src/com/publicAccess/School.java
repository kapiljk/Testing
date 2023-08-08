package com.publicAccess;

public class School {
	
	public School() { //constructor
		
	}
	
	public int age = 25; // data type
	
	public static void subject() { // method
		System.out.println("social subject");
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		School s = new School();
		s.subject();
	}

}
