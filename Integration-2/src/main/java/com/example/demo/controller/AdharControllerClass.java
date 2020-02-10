
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdharInfo;
import com.example.demo.service.AdharServiceClass;

@RestController
@RequestMapping("/adhar")
public class AdharControllerClass {

	@Autowired
	AdharServiceClass adharserviceclass;

	@PostMapping(value = "/insert", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void insertDataFromController(@RequestBody AdharInfo adharinfo) {

		adharserviceclass.insertData(adharinfo);
	}

	@PutMapping(value = "/update", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void updatecontroller(@RequestBody AdharInfo adharinfo) {

		adharserviceclass.updateData(adharinfo);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteController(@PathVariable("id") int id) {
		adharserviceclass.deleteData(id);

	}

	@GetMapping(value = "/get", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<AdharInfo> getAdharController() {
		return adharserviceclass.getAdharDetails();

	}
	
	
	@GetMapping(value="/getbyid/{id}")
	public Optional<AdharInfo> getDataController(@PathVariable("id") int id)
	{
		return  adharserviceclass.getDataById(id);
		
		
	}
	

}
