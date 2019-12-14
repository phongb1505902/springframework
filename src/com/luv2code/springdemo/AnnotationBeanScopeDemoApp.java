package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args){
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from sping container
        Coach theCoach =  context.getBean("tennisCoach",Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        // check if they are the same
        boolean result = (theCoach == alphaCoach);
        // print out the result
        System.out.println("\nPointing to the same object: "+result);
        // print instant 1
        System.out.println("\n Instant 1: "+theCoach);
        // print instant 2
        System.out.println("\n Instant 2: "+alphaCoach+"\n");
        //close context
        context.close();
    }
}
