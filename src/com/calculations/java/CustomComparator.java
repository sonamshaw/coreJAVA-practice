package com.calculations.java;

import java.util.Comparator;

public class CustomComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int s1ID = s1.getiD();
		int s2ID = s2.getiD();
		if(s1ID == s2ID){
			return 0;
		}else if(s1ID>s2ID){
			return 1;
		}else{
			return -1;
		}
	}

}
