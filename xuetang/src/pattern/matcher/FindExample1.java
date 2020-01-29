package pattern.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindExample1 {
    public static void main(String[] args) {
        String str = "-1234a334563";
        Pattern numberPattern = Pattern.compile("(\\+|-)?(\\d+)(\\D+)(.*)");
        Matcher matcher = numberPattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group());//匹配整个正则的部分
            System.out.println(matcher.group(0));//匹配整个正则的部分
            System.out.println(matcher.group(1));//匹配第1个括号的部分
            System.out.println(matcher.group(2));//匹配第2个括号的部分
            System.out.println(matcher.group(3));//匹配第3个括号的部分
            System.out.println(matcher.group(4));//匹配第4个括号的部分
        }

    }

}
