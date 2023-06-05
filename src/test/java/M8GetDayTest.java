import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import homeworks.M8.M8GetDay;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class M8GetDayTest {
    @Test
    @DisplayName("Getting day number test")
    public void getDayTest(){
        String expectedResult = "Sunday";
        String actualResult = M8GetDay.getDay(1);
        assertEquals(expectedResult, actualResult, "GetDay result is incorrect");
    }

    @Test
    @DisplayName("NullPointer Exception test")
    public void errorTest(){
        assertThrows(NullPointerException.class, () -> {M8GetDay.getDay(null);});
    }

    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(1,"Sunday"),
                Arguments.of(2,"Monday"),
                Arguments.of(3,"Tuesday"),
                Arguments.of(4,"Wednesday"),
                Arguments.of(5,"Thursday"),
                Arguments.of(6,"Friday"),
                Arguments.of(7,"Saturday")
        );
    }

    @ParameterizedTest
    @CsvSource({"1, Sunday", "2, Monday", "3, Tuesday", "4, Wednesday", "5, Thursday"})
    public void csvParamsTest(int day, String expectedResult){
        String actualResult = M8GetDay.getDay(day);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(int day, String expectedResult){
        String actualResult = M8GetDay.getDay(day);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @CsvSource({"8", "0"})
    public void csvParamsNegativeTest(int day){
        assertThrows(IndexOutOfBoundsException.class, () -> {M8GetDay.getDay(day);});
    }
}
