package oh.cmdln.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
    public static String readln() {
        String r = null;
        try {
            r = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert r != null;
        return r;
    }
    public static char readchar() {
        String r = null;
        try {
            r = String.valueOf(br.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert r != null;
        return r.toCharArray()[0];
    }
}
