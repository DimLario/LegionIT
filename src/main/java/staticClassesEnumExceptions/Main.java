package staticClassesEnumExceptions;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

//        double result = Calculator.Calculate(2, 3, Calculator.Type.SUMMARY);
        double result = Calculator.Calculate(2, 3, null);
        logger.info("result: " + result);
//        double result = Calculator.Calculate(2, 3, Calculator.Type.MULTIPLICATION);
//        System.out.println("result " + result);
//        result = Calculator.Calculate(21, 4, Calculator.Type.DIVISION);
//        System.out.println("result " + result);
////    try {                        // tries to run the method even if it has an error
//        result = Calculator.Calculate(245, 5, null);
//        System.out.println("result " + result);
////}
////    catch (Exception err){
////    System.out.println("Something went wrong");
////}
//        result = Calculator.Calculate(200, 300, Calculator.Type.SUMMARY);
//        System.out.println("result " + result);
        result = Calculator.Calculate(244, 3, Calculator.Type.SUBTRACTION);
        logger.info("result: " + result);

        result = Calculator.Calculate(224, 3, Calculator.Type.DIVISION);
        logger.info("result: " + result);
    }
}
