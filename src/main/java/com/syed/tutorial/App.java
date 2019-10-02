package com.syed.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syed.tutorial.bean.GreetService;

/**
 * Spring Hello World
 * syednavedali.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-config.xml");
    	
    	GreetService greetService = (GreetService)context.getBean("greeting");
    	System.out.println(greetService.greet());
    }
}
