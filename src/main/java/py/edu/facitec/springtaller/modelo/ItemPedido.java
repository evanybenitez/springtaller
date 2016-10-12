package py.edu.facitec.springtaller.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue
private long id;
private int cantidadProducto;
private double subTotal;
private Pedido pedido;
private Producto producto;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getCantidadProducto() {
	return cantidadProducto;
}
public void setCantidadProducto(int cantidadProducto) {
	this.cantidadProducto = cantidadProducto;
}
public double getSubTotal() {
	return subTotal;
}
public void setSubTotal(double subTotal) {
	this.subTotal = subTotal;
}
public Pedido getPedido() {
	return pedido;
}
public void setPedido(Pedido pedido) {
	this.pedido = pedido;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
@Override
public String toString() {
	return "ItemPedido [id=" + id + ", cantidadProducto=" + cantidadProducto + ", subTotal=" + subTotal + "]";
}

}
