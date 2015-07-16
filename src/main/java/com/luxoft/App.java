package com.luxoft;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/luxoft/beans/beans.xml");

        Person person = (Person) context.getBean("person");
        person.speak();
        System.out.println(person);

        Address address2 = (Address) context.getBean("address2");
        System.out.println(address2);
    }
}
