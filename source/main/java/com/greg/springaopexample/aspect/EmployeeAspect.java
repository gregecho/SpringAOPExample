package com.greg.springaopexample.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * Aspect classes are required to have @Aspect annotation.
 * 
 * @Before annotation is used to create Before advice
 * 
 * The string parameter passed in the @Before annotation is the Pointcut expression
 * getNameAdvice() advice will execute for any Spring Bean method with signature public String getName(). 
 * This is a very important point to remember, if we will create Employee bean using new operator the advices will not be applied. 
 * Only when we will use ApplicationContext to get the bean, advices will be applied.
 * 
 * We can use asterisk (*) as wild card in Pointcut expressions, 
 * getAllAdvice() will be applied for all the classes in com.greg.springaopexample.service package 
 * whose name starts with get and doesn’t take any arguments.
 */
@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getName()");
	}

	@Before("execution(* com.greg.springaopexample.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("Service method getter called");
	}
}
