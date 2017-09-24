package com.calculations.java;

public class Teacher extends Person {
	public Teacher() {
	}

	public static String schoolName;
	float baseSalary;
	float variableSalary;

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Teacher.schoolName = schoolName;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	public float getVariableSalary() {
		return variableSalary;
	}

	public void setVariableSalary(float variableSalary) {
		this.variableSalary = variableSalary;
	}

}
