package com.cjc.configuration;

import java.util.Properties;

import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Student;

import org.hibernate.dialect.MySQL5Dialect;

	@Configuration
	@EnableWebMvc
	@ComponentScan(basePackages = "com.cjc")
	public class AppConfigure {
		
		@Bean
		public InternalResourceViewResolver getResolver() {
			
			InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
			
			viewResolver.setSuffix(".jsp");
			return viewResolver;
		}
		
		@Bean
		public DriverManagerDataSource getDataSource() {
			
			DriverManagerDataSource ds= new DriverManagerDataSource();
			
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/test");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
			
		}
            @Bean
		public LocalSessionFactoryBean getFactoryBean() {
			
			LocalSessionFactoryBean lbean = new LocalSessionFactoryBean();
			
			lbean.setDataSource(getDataSource());
			
			Properties ps = new Properties();
			
			ps.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			
			ps.setProperty("hibernate.hbm2ddl.auto", "update");
			
			ps.setProperty("hibernate.show_sql", "true");
			
		    lbean.setHibernateProperties(ps);
		    
		    lbean.setAnnotatedClasses(Student.class);
		    
		    
			return lbean;
		    
		    
			
			
		}
}
