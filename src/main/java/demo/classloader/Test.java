package demo.classloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 3.25.20
// 3.25-bd
// 3.25.20-bc
public class Test {
    public static void main(String[] args) {
//        String s = "";
        Pattern p = Pattern.compile("(0*[0-9]+\\.0*[0-9]+)([\\.|-]?.*)");
        Matcher m = p.matcher("3.25.20");
        System.out.println(m.groupCount());
        while (m.find()) {
            System.out.println(m.group());
        }



    }
}
