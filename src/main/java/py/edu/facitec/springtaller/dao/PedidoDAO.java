package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Pedido;

@Repository
public class PedidoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Pedido pedido) {
		manager.persist(pedido);

}}
