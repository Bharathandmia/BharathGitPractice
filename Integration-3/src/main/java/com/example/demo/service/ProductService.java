package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoRepo;
import com.example.demo.model.ProductInfo;

@Service
public class ProductService {

	@Autowired
	DaoRepo daorepo;

	public void insertS(ProductInfo productinfo) {
		daorepo.save(productinfo);

	}

	public void updateS(ProductInfo productInfo) {
		daorepo.save(productInfo);

	}

	public void deleteS(int id) {
		daorepo.deleteById(id);

	}

	public List<ProductInfo> getInfo() {

		return daorepo.findAll();
	}

}
