package com.prueba.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.app.dao.IProductoDao;
import com.prueba.app.entities.ProductoEntity;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	public List<ProductoEntity> getProductos() {
		return productoDao.findAll();
	}

}
