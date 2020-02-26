package com.git.bean;

public class Add {
	
	//instance variables
	private Integer num1,num2;

	//default constructor
	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor
	public Add(Integer num1, Integer num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	//getters and setters
	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	//toString method
	public String toString() {
		return "Add [num1=" + num1 + ", num2=" + num2 + "]";
	}
	

	
	
}
