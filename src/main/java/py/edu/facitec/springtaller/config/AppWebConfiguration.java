package py.edu.facitec.springtaller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.springtaller.controller.HomeController;
import py.edu.facitec.springtaller.dao.ClienteDao;
//Activa el componente MVC de spring para trabajar con Sevlet
@EnableWebMvc

//Carga las clases necesarias para iniciar la aplicacion 
@ComponentScan(basePackageClasses={HomeController.class, ClienteDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
//Gestiona como nuevo componente de la aplicacion
 @Bean  
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		
		
		
		
		//El prefijo para la pagina
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
		}
	}
	

