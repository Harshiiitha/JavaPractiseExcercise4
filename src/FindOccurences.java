import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.io.*;
public class FindOccurences
{
    public List<String> findOccurences(String input,String find)
    {
        List<String> result=new ArrayList<String>();
        Pattern p=Pattern.compile(find);
        Matcher m=p.matcher(input);
        while(m.find())
        {
            result.add("Found at:"+m.start()+"-"+m.end());//finding start and end inndex of given string
        }

        return result;
    }
}
