package py.edu.facitec.springtaller.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	private Date fechaToma;
	private Date fechaEntrega;
	private double total;
	
	
	//anotacion que sirve que indicada una relacion de mucho para uno
	//posibilita la cracion la clave foranea
	@ManyToOne //de muchos a uno
	private Cliente cliente;
	
	@ManyToOne
	private Usuario usuario;
	
	
	@OneToMany(mappedBy="itemPedido")
	private List<ItemPedido>itemPedidos;


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


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<ItemPedido> getItemPedidos() {
		return itemPedidos;
	}


	public void setItemPedidos(List<ItemPedido> itemPedidos) {
		this.itemPedidos = itemPedidos;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaToma=" + fechaToma + ", fechaEntrega=" + fechaEntrega + ", total=" + total
				+ ", cliente=" + cliente + ", usuario=" + usuario + ", itemPedidos=" + itemPedidos + "]";
	}



	
	
	
	
	
	}
