package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdharInfo;


@Repository
public class RepositiryClass {
	
	
	@Autowired(required=true)
	RepositotyJpa repositotyJpa;

	public void insertData(AdharInfo adharinfo) 
	{
      
		repositotyJpa.save(adharinfo);
		
	}

	public AdharInfo update( ) {
		
		return repositotyJpa.save(null);
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		
	}

	public List<AdharInfo> fetchData() {
		// TODO Auto-generated method stub
		return null;
	}

}
