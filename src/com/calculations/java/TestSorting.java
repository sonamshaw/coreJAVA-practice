package com.calculations.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestSorting {

	public static void main(String[] args) {
		
		Student s1=new Student("swapan",101,500.00f,3,25.00f);
		Student s2=new Student("swapan",101,500.00f,3,25.00f);
		Student s3=new Student("john",21,500.00f,3,25.00f);
		Student s4=new Student("adam",10,500.00f,3,25.00f);;
		Student s5=new Student("dow",1,500.00f,3,25.00f);
		List<Student> st=new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		Collections.sort(st);
		
		for(Student s : st){
			System.out.println(s);
		}
		
		/*Map<Student, String> StudentMap = new HashMap<>();
		StudentMap.put(s1, "s1");
		StudentMap.put(s2, "s2");
		StudentMap.put(s3, "s3");
		StudentMap.put(s4, "s4");
		
		
		for(Entry< Student, String> e : StudentMap.entrySet()){
			System.out.println(e);
		}*/
	}

}
