package com.example.micro1Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.micro1.Vo.M2;
//
//@FeignClient(name="MICRO2",url="http://localhost:9002")
//public interface FeignClientCtrl {
//
//	@GetMapping("/m2byid/{id}")
//	public M2 retrieveExchangeValue(@PathVariable("id") int id);
//}
