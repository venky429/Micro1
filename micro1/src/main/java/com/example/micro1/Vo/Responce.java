package com.example.micro1.Vo;

import com.example.micro1.entities.Micro1;

public class Responce {


	private Micro1 m1;
	private M2 m2;
	public Micro1 getM1() {
		return m1;
	}
	public void setM1(Micro1 m1) {
		this.m1 = m1;
	}
	public M2 getM2() {
		return m2;
	}
	public void setM2(M2 m2) {
		this.m2 = m2;
	}
	public Responce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responce(Micro1 m1, M2 m2) {
		super();
		this.m1 = m1;
		this.m2 = m2;
	}
	
}
