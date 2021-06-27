package interpreterpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterJavaAPIDemo {

    public static void main(String[] args) {
        String input = "Lions , and tigers , and bears! oh , my";

        Pattern p = Pattern.compile("(Lions , and tigers , and bears! oh , my)");
        Matcher m = p.matcher("(Lions)");
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
