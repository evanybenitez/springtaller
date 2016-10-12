package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import py.edu.facitec.springtaller.model.Producto;

@Repository
public class ProductoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Producto producto) {
		manager.persist(producto);

}}
