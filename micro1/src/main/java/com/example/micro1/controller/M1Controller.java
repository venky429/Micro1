package com.example.micro1.controller;

import java.util.List;

//import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.micro1.Vo.M2;
import com.example.micro1.Vo.Responce;
import com.example.micro1.entities.Micro1;
import com.example.micro1.service.M1Service;
//import com.google.common.net.HttpHeaders;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/micro1")
public class M1Controller {

	@Autowired 
	private M1Service m1;
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/")
	public List<Micro1> getAllm1(){
		return m1.getAllM1();
	}	
	@PostMapping("/m1")
	public Micro1 saveM1(@RequestBody Micro1 m){
		return m1.save(m);
	}
//	@GetMapping("/getM2FromM1/{id}")
//	public Micro1 getM1ById(@PathVariable int id){
//		return m1.getM1(id);
//	}
	@GetMapping("/getM2FromM1/{id}")
	public 	Responce getM2FromM1(@PathVariable int id){
		return m1.getM1AndM2(id);
	}
	@GetMapping("/q")
	public String s() {
		M2 m2=rest.getForEntity("http://localhost:9002/M2/m2byid/1", M2.class).getBody();
		System.out.println(m2.getId()+"  "+m2.getName());
		return "working";
	}
	
//	 @GetMapping("/sort")
//	    public ResponseEntity<List<Micro1>> getAllEmployees(
//	                        @RequestParam(defaultValue = "0") Integer pageNo, 
//	                        @RequestParam(defaultValue = "5") Integer pageSize,
//	                        @RequestParam(defaultValue = "id") String sortBy) 
//	    {
//	        List<Micro1> list = m1.getAllEmployees(pageNo, pageSize, sortBy);
//	        
//	        System.out.println("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//	 
//	        return new ResponseEntity<List<Micro1>>(list, new HttpHeaders(), HttpStatus.OK); 
//	    }
	
}
