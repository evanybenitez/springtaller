package py.edu.facitec.springtaller.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Pedido {
	@Id
	@GeneratedValue
private Long id;
private Date fechaToma;
private Date fechaEntrega;
private double total;
//trata de uns relacion de muchos a uno
//posibilita la creacion de la clase foranea
@ManyToOne
private Cliente cliente;

private ItemPedido itemPedido;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getFechaToma() {
	return fechaToma;
}
public void setFechaToma(Date fechaToma) {
	this.fechaToma = fechaToma;
}
public Date getFechaEntrega() {
	return fechaEntrega;
}
public void setFechaEntrega(Date fechaEntrega) {
	this.fechaEntrega = fechaEntrega;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public ItemPedido getItemPedido() {
	return itemPedido;
}
public void setItemPedido(ItemPedido itemPedido) {
	this.itemPedido = itemPedido;
}
@Override
public String toString() {
	return "Pedido [id=" + id + ", fechaToma=" + fechaToma + ", fechaEntrega=" + fechaEntrega + ", total=" + total
			+ "]";
}

}
