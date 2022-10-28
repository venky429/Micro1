package com.example.micro1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Micro1 {

	@Id
	private int m1Id;
	
	private String name;
	
	private int m2Id;

	public int getM1Id() {
		return m1Id;
	}

	public void setM1Id(int m1Id) {
		this.m1Id = m1Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM2Id() {
		return m2Id;
	}

	public void setM2Id(int m2Id) {
		this.m2Id = m2Id;
	}

	@Override
	public String toString() {
		return "Micro1 [m1Id=" + m1Id + ", name=" + name + ", m2Id=" + m2Id + "]";
	}

	public Micro1(int m1Id, String name, int m2Id) {
		super();
		this.m1Id = m1Id;
		this.name = name;
		this.m2Id = m2Id;
	}
	public Micro1() {
		
	}
	
	
}
