package co.com.sofka.pruebasMaven;

import co.com.sofka.pruebasMaven.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebasMavenApplication {

	private static final Logger logger = LoggerFactory.getLogger( PruebasMavenApplication.class );

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.println( "Enter number 1: " );
		String textNumber1 = bufferedReader.readLine();

		System.out.println( "Enter number 2: " );
		String textNumber2 = bufferedReader.readLine();

		Long number1 = Long.valueOf( textNumber1 );
		Long number2 = Long.valueOf( textNumber2 );

		// operations
		BasicCalculator calculator = new BasicCalculator();

		Long result;

		// adding
		result = calculator.sum( number1, number2 );
		System.out.println( number1 + " + " + number2 + " = " + result );

		// Subtraction
		result = calculator.subt( number1, number2 );
		System.out.println( number1 + " - " + number2 + " = " + result );

		// Multiplying
		result = calculator.mult( number1, number2 );
		System.out.println( number1 + " * " + number2 + " = " + result );

		// Divide
		Double resultDiv = calculator.div( number1, number2 );
		System.out.println( number1 + " / " + number2 + " = " + resultDiv );

		// Module
		result = calculator.mod( number1, number2 );
		System.out.println( number1 + " % " + number2 + " = " + result );

	}

}
