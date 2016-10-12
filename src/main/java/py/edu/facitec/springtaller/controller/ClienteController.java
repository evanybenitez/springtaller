package py.edu.facitec.springtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.springtaller.dao.ClienteDao;
import py.edu.facitec.springtaller.modelo.Cliente;
//gestionar transacciones 
@Transactional

@Controller
public class ClienteController {
	//inyectar una depnedencia del dao
@Autowired
	private ClienteDao clienteDao;

	@RequestMapping("/cliente")
	//viene los datos del formulario 
	
	//y se pasa al objeto
	public String save(Cliente cliente){
		
		System.out.println("Registrando el cliente: "+cliente);  
		clienteDao.save(cliente);
		System.out.println("Registrado con Exito");
		//crear la pagina ok.jsp
		
		return "/cliente/ok"; 
		
	}
	//crear el metodo para acceder al formulario
	  @RequestMapping("/clientes/formulario") 
	  public String formulario(){     
		  return "/cliente/formulario";  } 
	 
}
