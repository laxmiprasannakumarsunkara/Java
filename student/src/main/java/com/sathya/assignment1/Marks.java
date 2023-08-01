package com.sathya.assignment1;

public class Marks {
	private int maths;
	private int science;
	private int social;
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int total() {
		int totalmarks = maths+science+social;
		System.out.println("The Total Marks"+totalmarks);
		return totalmarks;
	}
	public double average() {
		double averagemarks = (maths+science+social)/3;
		System.out.println("The Average Marks"+averagemarks);
		return averagemarks;
	}

	
	

}
