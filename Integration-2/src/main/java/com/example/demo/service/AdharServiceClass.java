package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdharInfo;
import com.example.demo.repository.RepositoryInterface;

@Service
public class AdharServiceClass {

	@Autowired
	RepositoryInterface repositoryinterface;

	public void insertData(AdharInfo adharinfo) {
		repositoryinterface.save(adharinfo);

	}
	
	public void updateData(AdharInfo adharinfo)
	{
		repositoryinterface.save(adharinfo);
		
	}
	
	public void deleteData(int id)
	{
		
		repositoryinterface.deleteById(id);
	}
	
	public List<AdharInfo> getAdharDetails()
	{
		return repositoryinterface.findAll() ;
		
	}

	
	public Optional<AdharInfo> getDataById(int id)
	{
		return repositoryinterface.findById(id) ;
		
		
	}
	

}
