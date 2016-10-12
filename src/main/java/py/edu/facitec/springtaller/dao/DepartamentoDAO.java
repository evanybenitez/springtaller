package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Departamento;

@Repository
public class DepartamentoDAO {
	
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Departamento departamento) {
		manager.persist(departamento);
		
	}
	
	

}
