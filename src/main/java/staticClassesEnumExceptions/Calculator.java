package staticClassesEnumExceptions;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {
//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type {               //enum creates final constants (impossible to change them)
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double Calculate(double a, double b, Type type) {

        logger.info("Running method calculate");
        double result = 0;
        try {                     //tries to run all methods even if they have errors
            switch (type) {       //similar to "IF" function
                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;
                case DIVISION:
                    result = a / b;
                    break;
                case SUBTRACTION:
                    result = a - b;
                    break;
                default:
                    result = -1;
            }
        }
        catch (Exception err) {                        // catches wrong method
//            System.out.println("Something went wrong");
            logger.error("Something went wrong", err);
            throw err;
        }
        return result;
    }
}
