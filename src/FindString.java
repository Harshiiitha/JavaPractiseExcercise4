import java.util.regex.*;
import java.io.*;
public class FindString {
    public String findHarry(String input,String find)
    {
        if(input==null)
        {
            return "Strings cannot be null";
        }
        Pattern p=Pattern.compile(find);
        Matcher m=p.matcher(input);
        return ""+m.find();//To find occurence of string
    }
}
