package com.example.micro1.service;

import java.util.List;

import com.example.micro1.Vo.Responce;
import com.example.micro1.entities.Micro1;

public interface M1Service {

	public List<Micro1> getAllM1();
	public Micro1 getM1(int id);
	public Micro1 save(Micro1 m);
	public Responce getM2FromM1(int id);
	public Responce getM1AndM2(int id) ;
	public List<Micro1> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy);
}
