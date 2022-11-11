package com.cjc._Spring_IOC_Java_Based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
    public Employee getEmployee() {   // <bean id="getEmoloyee" class="com.cjc.Employee"/>
   Employee e=new Employee();
   
  // e.setAddress(getAddress());
	
   return e;
    }

	 @Bean
	public Address getAddress() {
		Address ad=new Address();
		ad.setArea("Akurdi");
	  return ad;
	}

} 
