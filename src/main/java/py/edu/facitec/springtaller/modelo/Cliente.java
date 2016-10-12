package py.edu.facitec.springtaller.modelo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.mapping.Value;

import antlr.collections.List;

//significa que se creara una tabla cliente
@Entity 
public class Cliente {
	//identificacion de clase primaria
	@Id
	//Generacion AUTOMATICA DE VALOR
	@GeneratedValue
private Integer id;
private String nombre;
private String correo;
@OneToMany (mappedBy = "cliente")
//private List<Pedido> pedidos;
private java.util.List<Pedido> pedidos;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
@Override
public String toString() {
	return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
}

	
}
