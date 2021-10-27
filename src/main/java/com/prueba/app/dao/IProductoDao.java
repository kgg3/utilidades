package com.prueba.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.app.entities.ProductoEntity;

public interface IProductoDao extends JpaRepository<ProductoEntity, Long> {

}
