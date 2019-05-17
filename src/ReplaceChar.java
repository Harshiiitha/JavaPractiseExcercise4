import java.io.*;
import java.util.regex.*;
public class ReplaceChar {
    public String replaceCharacter(String input)
    {
        /*creating a pattern for d
         and replace with f*/
        Pattern p=Pattern.compile("d");
        Matcher m=p.matcher(input);
        String output=m.replaceAll("f");
        /*creating a pattern for l
         and replace with t*/
        Pattern p1=Pattern.compile("l");
        Matcher m1=p1.matcher(output);
        String output1=m1.replaceAll("t");
        return output1;

    }
}
