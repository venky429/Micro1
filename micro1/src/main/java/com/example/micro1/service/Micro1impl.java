package com.example.micro1.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.micro1.Vo.M2;
import com.example.micro1.Vo.Responce;
import com.example.micro1.entities.Micro1;
import com.example.micro1.repo.M1Repo;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Service
public class Micro1impl implements M1Service{
	
	
	@Autowired
	private M1Repo m1;
	
	@Autowired
	private RestTemplate rest;
	
	

	@Override
	public List<Micro1> getAllM1() {
	
		return m1.findAll();
	}

	@Override
	public Micro1 getM1(int id) {

		return m1.findById(id).get();
	}

	@Override
	public Micro1 save(Micro1 m) {
		// TODO Auto-generated method stub
		return m1.save(m);
	}

	@Override
	public 	Responce getM2FromM1(int id) {
		// TODO Auto-generated method stub\
	//	RestTemplate rest=new RestTemplate();
System.out.println("entered in rest method");
	Micro1 micro1=getM1(id);
	System.out.println(micro1);
		M2 m2=rest.getForObject("http://localhost:9002/M2/m2byid/1"
				, M2.class);
		System.out.println(m2);
				Responce responce=new Responce();
		
		responce.setM1(micro1);
		responce.setM2(m2);
		
//		M2 m2a=f.retrieveExchangeValue(micro1.getM2Id());
//		System.out.println(m2a);
		return null;
	}
	@Override
	public Responce getM1AndM2(int id) {
		Micro1 micro1=getM1(id);
		M2 m2=rest.getForObject("http://MICRO2/M2/m2byid/1", M2.class);
		Responce responce=new Responce();
		responce.setM1(micro1);
		responce.setM2(m2);
		return responce;
	}

	@Override
	 public List<Micro1> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = (Pageable) PageRequest.of(pageNo, pageSize);
 
        Page<Micro1> pagedResult = m1.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Micro1>();
        }
    }

}
