import java.util.Locale;

public class ReadableSecondsParser {
    public static void main(String[] args) {
        System.out.println(formatDuration(30000000));
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int years = seconds / 31536000;
        int days = (seconds % 31536000) / 86400;
        int hours = ((seconds % 31536000) % 86400) / 3600;
        int minutes = (((seconds % 31536000) % 86400) % 3600) / 60;
        int remainingSeconds = (((seconds % 31536000) % 86400) % 3600) % 60;

        StringBuilder builder = new StringBuilder();
        int componentCount = 0;

        if (years > 0) {
            builder.append(years).append(years == 1 ? " year" : " years");
            componentCount++;
        }

        if (days > 0) {
            if (componentCount > 0) {
                builder.append(", ");
            }
            builder.append(days).append(days == 1 ? " day" : " days");
            componentCount++;
        }

        if (hours > 0) {
            if (componentCount > 0) {
                builder.append(", ");
            }
            builder.append(hours).append(hours == 1 ? " hour" : " hours");
            componentCount++;
        }

        if (minutes > 0) {
            if (componentCount > 0) {
                if (remainingSeconds > 0) {
                    builder.append(", ");
                } else {
                    builder.append(" and ");
                }
            }
            builder.append(minutes).append(minutes == 1 ? " minute" : " minutes");
            componentCount++;
        }

        if (remainingSeconds > 0) {
            if (componentCount > 0) {
                builder.append(" and ");
            }
            builder.append(remainingSeconds).append(remainingSeconds == 1 ? " second" : " seconds");
        }
        return builder.toString();
    }
}

        // Mentor Solution
//    public static String formatDuration(int seconds) {
//        String result = "";
//        int[] units = new int[] {31536000, 86400, 3600, 60, 1};
//        String[] labels = new String[] {"year", "day", "hour", "minute", "second"};
//        if (seconds == 0) {
//            return "now";
//        }
//        for (int i = 0; i < 5; i++) {
//            if (seconds >= units[i]) {
//                int quantity = seconds / units[i];
//                seconds = seconds % units[i];
//                result += (result.equals("") ? "" : (seconds == 0 ? " and " : ", "))
//                        + quantity + " " + labels[i] + (quantity > 1 ? "s" : "");
//            }
//        }
//        return result;
//    }
