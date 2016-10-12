package py.edu.facitec.springtaller.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Producto {
	@Id
	@GeneratedValue
private long id;
private String descripcion;
private Date fechaVencimiento;
private double precio;
private Integer cantidad;


@Override
public String toString() {
	return "Producto [id=" + id + ", descripcion=" + descripcion + ", fechaVencimiento=" + fechaVencimiento
			+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
}

}
