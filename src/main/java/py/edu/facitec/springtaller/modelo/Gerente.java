package py.edu.facitec.springtaller.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
	@Id
	@GeneratedValue
private Integer is;
private String ci;
private String nombre;
@OneToOne(mappedBy ="gerente")
private Departamento departameno;

public String toString() {
	return "Gerente [is=" + is + ", ci=" + ci + ", nombre=" + nombre + "]";
}

}
