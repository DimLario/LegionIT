package homeworks.M8;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class M8GetDay {
    private static final Logger logger = LogManager.getLogger(M8GetDay.class);
    public static String getDay(Integer dayNumber) {
        logger.info("Running method getDay");
        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        if (dayNumber == null) {
            logger.error("Day number is null");
            throw new NullPointerException("Day number is null");
        }
        else if (dayNumber < 1) {
            logger.error("Day number less than 1");
            throw new IndexOutOfBoundsException("The number should be equal or larger than 1");
//            return "------------------------------ \n" + "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            logger.error("Day number greater than 7");
            throw new IndexOutOfBoundsException("The number should be equal or smaller than 7");
//            return "------------------------------ \n" + "The number should be equal or smaller than 7";
        } else {
            return daysList.get(dayNumber - 1);
        }
    }
}
