package com.java8;

public class Carsdemo {
	int no;
	String carname;
    double speed;
	
	public Carsdemo(int no, String carname, double speed) {
		
		this.no = no;
		this.carname = carname;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return " no=" + no + ", carname=" + carname + ", speed=" + speed + "";
	}

	
}
