package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	 	
    	 Employee employee = context.getBean(Employee.class , "E1");
    	 
    	 System.out.println(employee);
    }
}
