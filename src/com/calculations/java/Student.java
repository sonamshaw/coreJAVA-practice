package com.calculations.java;

public class Student extends Person implements Comparable<Student>{
	public Student() {
	}
	
	

	public Student(String name, int iD, float fee, int monthCount, float fine) {
		super();
		this.name = name;
		this.iD = iD;
		this.fee = fee;
		this.monthCount = monthCount;
		this.fine = fine;
	}



	public static String schoolName;

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public float getFine() {
		return fine;
	}

	public void setFine(float fine) {
		this.fine = fine;
	}

	public int getMonthCount() {
		return monthCount;
	}

	public void setMonthCount(int monthCount) {
		this.monthCount = monthCount;
	}

	private String name;
	private int iD;
	private float fee;
	private int monthCount;
	private float fine;

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", iD=" + iD + ", fee=" + fee + ", monthCount=" + monthCount + ", fine=" + fine
				+ "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(fee);
		result = prime * result + Float.floatToIntBits(fine);
		result = prime * result + iD;
		result = prime * result + monthCount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Float.floatToIntBits(fee) != Float.floatToIntBits(other.fee))
			return false;
		if (Float.floatToIntBits(fine) != Float.floatToIntBits(other.fine))
			return false;
		if (iD != other.iD)
			return false;
		if (monthCount != other.monthCount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
