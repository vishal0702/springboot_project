package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d1 = (Demo) context.getBean("demo");
		System.out.println(d1);

		SpelExpressionParser spel= new SpelExpressionParser();
		Expression ex1 = spel.parseExpression("10+20");
		System.out.println(ex1.getValue());
	}

}
