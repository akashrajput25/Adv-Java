package environment;

import java.nio.file.Path;

public class getenv {
    public static void main(String[] argv) {
        System.out.println("System.getenv(\"PATH\") = " + System.getenv("PATH"));
    }
}