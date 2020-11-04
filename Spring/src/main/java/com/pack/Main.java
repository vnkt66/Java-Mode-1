package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource r = new ClassPathResource("emp.xml");
		Resource r = new FileSystemResource("common.xml");
		BeanFactory b = new XmlBeanFactory(r);
//		ConfigurableApplicationContext a = new FileSystemXmlApplicationContext("common.xml");
//		ApplicationContext a = new AnnotationConfigApplicationContext(XmlConfig.class);
		System.out.println("I am in Main");
		Scan s = b.getBean(Scan.class);
//		s.setBike(b.getBean(Bike.class));
//		e.setName("sam");
//		e.setBike((Bike)a.getBean(Bike.class));
		System.out.println(s);
//		a.registerShutdownHook();
//		System.out.println("I am closed");
	}

}
