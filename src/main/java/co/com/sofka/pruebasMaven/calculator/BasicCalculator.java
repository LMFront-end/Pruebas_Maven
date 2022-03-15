package co.com.sofka.pruebasMaven.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    // suma
    public Long sum(Long number1, Long number2) {
        logger.info( "Adding {} + {}", number1, number2 );
        return number1 + number2;
    }

    // resta
    public Long subt(Long number1, Long number2) {
        logger.info( "Subtraction {} - {}", number1, number2 );
        return number1 - number2;
    }

    // multiplicación
    public Long mult(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    // división
    public Long div(Long number1, Long number2) throws IllegalArgumentException {
        if(number2 == 0){
            //logger.error("cannot be divided by 0");
            throw new IllegalArgumentException("cannot be divided by 0");

        }
        logger.info( "Divide {} / {}", number1, number2 );
        return number1 / number2;
    }

    // modulo
    public Long mod(Long number1, Long number2) {
        logger.info( "Module {} % {}", number1, number2 );
        return number1 % number2;
    }
}
