import java.io.*;
import java.util.regex.*;
import java.util.Collections;
public class CountCharacter {
    public String countChar(String input,String c)
    {
            if(input==null)
            {
                return "String cannot be null";
            }
            int count = 0;//to store the count of occurence of character
            Pattern p = Pattern.compile(c);//creating a pattern to match multiple times
            Matcher m = p.matcher(input);
            while (m.find())
            {
                count++;
            }
            return "count is "+count;

    }
}
