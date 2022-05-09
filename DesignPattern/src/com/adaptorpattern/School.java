package com.adaptorpattern;

public class School {
	
	public static void main(String[] args) {
		
		Pen p = new AdaptorPen();
		
		AssignmentWork aw= new AssignmentWork();
		aw.setPen(p);
		aw.writeAssignment("Im bit tired to write assignment");
	}

}
