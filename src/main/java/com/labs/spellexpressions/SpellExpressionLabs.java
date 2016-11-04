package com.labs.spellexpressions;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpellExpressionLabs {

	
	public static void main(String[] args) {
		SpellExpressionLabs labs = new SpellExpressionLabs();
		labs.helloWorld();
	}
		
		
	public void helloWorld(){	
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression1 = expressionParser.parseExpression("'Hello World!!'");
		System.out.println((String)expression1.getValue());
		
		Expression expression2 = expressionParser.parseExpression("'Hello World'.concat('!')");
		System.out.println((String)expression2.getValue());
		
		
		Expression expression3 = expressionParser.parseExpression("2+3");
		System.out.println(expression3.getValue());
		
	}
	
	
	
}
