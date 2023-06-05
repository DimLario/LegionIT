import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import staticClassesEnumExceptions.Calculator;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @BeforeAll
    public static void classSetup(){
        System.out.println("Before all method");
    }
    @AfterAll
    public static void classTearDown(){
        System.out.println("After all method");
    }
    @BeforeEach
    public void beforeTest(){
        System.out.println("Before each method");
    }
    @AfterEach
    public void afterTest(){
        System.out.println("After test method");
    }

    static Stream<Arguments> dataProvider(){  //provides data to methodSourceTest method
        return Stream.of(
                Arguments.of(2,2,4,Calculator.Type.SUMMARY),
                Arguments.of(4,2,2,Calculator.Type.DIVISION),
                Arguments.of(2,2,4,Calculator.Type.MULTIPLICATION),
                Arguments.of(5,3,2,Calculator.Type.SUBTRACTION)
        );
    }

    @ParameterizedTest
    @CsvSource({"2, 2, 4, SUMMARY", "4, 2, 2, DIVISION"})  //validate summarizing and division for the provided numbers...
    public void csvParamsTest(int a, int b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.Calculate(a, b, type);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")          //receives data from dataProvider
    public void methodSourceTest(double a, double b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.Calculate(a, b, type);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, 428762894, -387465872})
    public void summaryParamsTest(int a){
        double b = 6;
        double expectedResult = b + a;
        double actualResult = Calculator.Calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult, "Summary result is incorrect"); //prints the message if result is incorrect
    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypesTest(Calculator.Type type){
        double a = 7;
        double b = 6;

        double actualResult = Calculator.Calculate(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult > 0);
    }

    @Test
    public void summeryTest(){
        double a = 5;
        double b = 6;
        double expectedResult = 11;

        double actualResult = Calculator.Calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult, "Summary result is incorrect"); //prints the message if result is incorrect
    }

    @Test
    public void  division(){
        double a = 8;
        double b = 2;
        double expectedResult = 4;

        double actualResult = Calculator.Calculate(a, b, Calculator.Type.DIVISION);
        assertEquals(expectedResult, actualResult, "Division result is incorrect"); //prints the message if result is incorrect
        assertTrue(expectedResult == actualResult);
        assertTrue(actualResult > 0);
        assertFalse(actualResult == 0);
    }
    @Test
    @DisplayName("NullPointer Exception test")
    public void errorTest(){
            double a = 10;
            double b = 2;
//            double expectedResult = 5;
//            double actualResult = Calculator.Calculate(a, b, Calculator.Type.DIVISION);
            assertThrows( NullPointerException.class, () -> {Calculator.Calculate(a, b, null);}); //confirm the error (Type is null)
    }
}
