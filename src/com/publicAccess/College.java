package com.publicAccess;

public class College  extends School{
	
	private void teacher() {
		School b = new School();
		b.subject();
	}
	
	public static void main(String[] args) {
		//School s = new School();
		subject();
		
		College c = new College();
		c.teacher();
	}

}
