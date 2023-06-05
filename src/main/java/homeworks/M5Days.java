package homeworks;

import java.util.ArrayList;

public class M5Days {
// public. returnable type. function name. input parameter
    public String getDay(int day) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        return days.get(day-1);
    }

    public static void main(String[] args) {
        M5Days m5 = new M5Days();  //creates class instance
        System.out.println(m5.getDay(2)); //calls a day based on the provided number
    }
}
