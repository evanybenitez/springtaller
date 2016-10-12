package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.modelo.Cliente;

@Repository
// clase encargada de la manipulacion de datos, posibilita posteriormente utilizar la anotacion
//auwired
public class ClienteDao {
	//Gestiona el Entity Manager
	@PersistenceContext
	private EntityManager manager;
	
	
	
	public void save(Cliente cliente){
		//METODO PARA INSERTAR UN DATO
		manager.persist(cliente);
	}

}
