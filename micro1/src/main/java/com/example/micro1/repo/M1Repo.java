package com.example.micro1.repo;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.micro1.entities.Micro1;

public interface M1Repo extends JpaRepository<Micro1,Integer> {

	Page<Micro1> findAll(Pageable paging);

}
