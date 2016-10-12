package py.edu.facitec.springtaller.dao;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DAOGenerico<T> {
	
	private Class<T> entityClass;
	
public DAOGenerico(Class<T>entityClass) {
	this.entityClass=entityClass;
	
}
protected abstract EntityManager getEntityManager();
	


public void insertar(T entity){
	getEntityManager().persist(entity);
}
	public void actualizar(T entity){
		getEntityManager().merge(entity);
	}
	public void elimininar(T entity){
		getEntityManager().remove(getEntityManager().contains(entity)? entity:   getEntityManager().merge(entity) );
		} 
	

      
	

public List<T> buscartodo(){  return getEntityManager().createQuery   
		("from "+entityClass.getSimpleName(), 
				entityClass).getResultList();    
} 
public T buscar(Object id){ 
	//System.out.println("Entidad: "+getEntityManager().find(entityClass, id));
	return getEntityManager().find(entityClass, id);      } 
	
}


