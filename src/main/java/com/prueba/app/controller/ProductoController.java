package com.prueba.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.app.entities.ProductoEntity;
import com.prueba.app.model.Producto;
import com.prueba.app.service.IProductoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET)
	public List<Producto> productos(){
		List<ProductoEntity> productosEntity = productoService.getProductos();
		return convertir(productosEntity);
	}
	
	private List<Producto> convertir(List<ProductoEntity> productosEntity) {
		List<Producto> listaProductos = new ArrayList<Producto>();
		for(ProductoEntity producto : productosEntity) {
			listaProductos.add(new Producto(producto.getId(), producto.getNombre(), producto.getTipo(), producto.getCantidad()));
		}
		return listaProductos;
	}
}
