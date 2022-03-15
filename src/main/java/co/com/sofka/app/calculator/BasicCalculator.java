package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long restar(Long number1, Long number2){
        logger.info( "Restar {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplicar(Long number1, Long number2){
        logger.info( "Multiplicar {} - {}", number1, number2);
        return number1 * number2;
    }

    public Long dividir(Long number1, Long number2){
        logger.info( "dividir {} - {}", number1, number2);
        if(number1 == 0 || number2 == 0){
            throw new IllegalArgumentException("No puede se puede realizar la operacion");
        }
        return number1 / number2;
    }
}
