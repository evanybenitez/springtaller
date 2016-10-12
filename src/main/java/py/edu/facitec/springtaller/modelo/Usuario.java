package py.edu.facitec.springtaller.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
private String login;
private String name;
private String pasword;

public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPasword() {
	return pasword;
}
public void setPasword(String pasword) {
	this.pasword = pasword;
}
@Override
public String toString() {
	return "Usuario [login=" + login + ", name=" + name + ", pasword=" + pasword + "]";
}
 
}
