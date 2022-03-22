package com.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringApp {
	
	public static void main (String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
//		Employee emp1 = (Employee)factory.getBean("emp1");
//		System.out.println(emp1.getEmployeeName());
//		
//		Employee emp2 = (Employee)factory.getBean("emp2");
//		System.out.println(emp2.getEmployeeName());
//		
//		Employee emp3 = (Employee)factory.getBean("emp3");
//		System.out.println(emp3.getEmployeeName());
		
		Customer cust = (Customer)factory.getBean("cust");
		System.out.print(cust);
		
		Address address1 = (Address) factory.getBean("address1");
		System.out.println(address1);
		
		Address address2 = (Address) factory.getBean("address2");
		System.out.println(address2);
	}

}
