package com.calculations.java;

public class Calculator {

	public float calculateFee(Student student) {
		float dueFee;
		if (student.getFine() != 0) {
			dueFee = student.getFee() * student.getMonthCount() + student.getFine();
		} else {
			dueFee = student.getFee() * student.getMonthCount();
		}
		return dueFee;

	}
	public float calculateSalary(Teacher teacher){
		float totalSalary;
		totalSalary=teacher.getBaseSalary()+teacher.getVariableSalary();
		return totalSalary;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setFee(1000.00f);
		student.setMonthCount(5);
		//student.setFine(55.00f);
		Calculator fc=new Calculator();
		float dueAmount=fc.calculateFee(student);
		System.out.println("Fee of Student is: "+dueAmount);
		Teacher teacher= new Teacher();
		teacher.setBaseSalary(7000.00f);
		teacher.setVariableSalary(5000.00f);
		float salary=fc.calculateSalary(teacher);
		System.out.println("Salary of teacher: "+salary);
				
	}

}
