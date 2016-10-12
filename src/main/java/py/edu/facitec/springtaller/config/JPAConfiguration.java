package py.edu.facitec.springtaller.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration { 
	@Bean
	public LocalContainerEntityManagerFactoryBean
	entityManagerFactory(){ 
		LocalContainerEntityManagerFactoryBean em = new  
	    LocalContainerEntityManagerFactoryBean(); 
		em.setDataSource(dataSource());  
		em.setPackagesToScan(new String[] 
				//paquete a escanear entidades o modelos 
		{ "py.edu.facitec.springtaller.modelo" });
		JpaVendorAdapter vendorAdapter =
		new HibernateJpaVendorAdapter(); 
		em.setJpaVendorAdapter(vendorAdapter); 
        em.setJpaProperties(additionalProperties()); 
        return em; 
        } 
	@Bean 
	public DataSource dataSource(){ 
		DriverManagerDataSource dataSource = 
		new DriverManagerDataSource();  
		dataSource.setDriverClassName("com.mysql.jdbc.Driver"); 
		                                //nombre de la base de datos
		dataSource.setUrl(  "jdbc:mysql://localhost:3306/springtaller_bd");  
		dataSource.setUsername( "root" );
		dataSource.setPassword( "" );  
		return dataSource;  } 
	private Properties additionalProperties() {
		Properties properties = new Properties(); 
		properties.setProperty("hibernate.hbm2ddl.auto",  "update"); 
		properties.setProperty("hibernate.dialect",    "org.hibernate.dialect.MySQL5Dialect");  
     	properties.setProperty("hibernate.show_sql", "true");
	//	properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		return properties;    }  
		 
@Bean  public PlatformTransactionManager  transactionManager  (EntityManagerFactory emf){ 
	JpaTransactionManager transactionManager =  new JpaTransactionManager();
	transactionManager.setEntityManagerFactory(emf);
	return transactionManager;  }     }   