package oh.logging;

import java.util.Date;

public class Log {
    private static Date date;
    public static void log(String log) {
        System.out.println("[" + date.getHours() + ":" + date.getMinutes() + "] " + log);
    }
}
