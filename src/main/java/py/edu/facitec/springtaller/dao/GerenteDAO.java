package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import py.edu.facitec.springtaller.model.Gerente;

@Repository
public class GerenteDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Gerente gerente) {
		manager.persist(gerente);
	
	

}}
