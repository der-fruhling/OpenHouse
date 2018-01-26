package shell.bash.oh;

import java.io.IOException;

public class bash {
    public static void run(String file) throws IOException {
        String[] cmdScript = new String[]{"/bin/bash", file};
        Process procScript = Runtime.getRuntime().exec(cmdScript);
    }
}
