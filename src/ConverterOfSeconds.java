import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ConverterOfSeconds {
    public static void main(String[] args) {
        String result = convertTime(86399);
        System.out.println(result);
    }

    public static String convertTime(int seconds) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.of(0, 0, 0);
        LocalTime newTime = time.plusSeconds(seconds);
        return newTime.format(formatter);
    }
}

