package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
//@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Customer cust=ctx.getBean("cust",Customer.class);
        System.out.println(cust);
    }
   
}
