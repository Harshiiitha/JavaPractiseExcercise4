import java.util.*;
public class SortWords {
    public List<String> sortWords(String input)
    {
        input=input.toLowerCase();
        List<String> wordlist=Arrays.asList(input.split(" "));//splitting thw words of a paragraph
        Collections.sort(wordlist);//to sort words in a list
        return wordlist;
    }
}
