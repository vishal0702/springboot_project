package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{11+55-98/7*10}")
	private int y;

	// Passing static method using SpEL
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;

	// Passing value using SpEL
	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	// Passing object using SpEL
	@Value("#{	new java.lang.String('Vishal Srivastava')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
