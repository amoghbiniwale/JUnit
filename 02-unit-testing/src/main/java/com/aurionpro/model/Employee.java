package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double basic;
	private double hra = 0.20;
	private double da = 0.15;
	private double ta = 0.10;

	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double calculateAnnualCTC() {
		return basic + hra + da + ta * 12;
	}

	public double calculateMonthlySalry() {
		return basic;
	}
}
