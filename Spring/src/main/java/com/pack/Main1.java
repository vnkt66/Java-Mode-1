package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main1 {

	public static void main(String[] args) {
//		Resource r = new FileSystemResource("common2.xml");
//		BeanFactory b = new XmlBeanFactory(r);
		ConfigurableApplicationContext a = new FileSystemXmlApplicationContext("common2.xml");
		System.out.println("I am in Main");
		Scan s = a.getBean(Scan.class);
		System.out.println(s);
	}

}
