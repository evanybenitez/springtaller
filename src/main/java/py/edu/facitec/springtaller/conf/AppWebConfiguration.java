package py.edu.facitec.springtaller.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.springtaller.controller.HomeController;
import py.edu.facitec.springtaller.dao.ClienteDao;
import py.edu.facitec.springtaller.dao.DepartamentoDAO;
import py.edu.facitec.springtaller.dao.GerenteDAO;
import py.edu.facitec.springtaller.dao.ItemPedidoDAO;
import py.edu.facitec.springtaller.dao.PedidoDAO;
import py.edu.facitec.springtaller.dao.ProductoDAO;
import py.edu.facitec.springtaller.dao.UsuarioDAO;


//activva el componente MVC de Spring para trabajar con Servelet
@EnableWebMvc

//carga las clases necesarias para iniciar la aplicacion
@ComponentScan(basePackageClasses={HomeController.class, DepartamentoDAO.class, GerenteDAO.class,
		ItemPedidoDAO.class, PedidoDAO.class, ProductoDAO.class, UsuarioDAO.class, ClienteDao.class})

public class AppWebConfiguration extends WebMvcConfigurerAdapter{
	
	
	//Gestiona como un nuevo componente de la aplicacion
	//esto es una anotacion ojooo
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	//configuraacionres necesarias para  habilitar peticiones de recursos estaticos css, javascript ,etc;
	@Override  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {   configurer.enable();  }   

}
