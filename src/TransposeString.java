import java.io.*;
import java.util.Arrays;
import java.util.List;

public class TransposeString {
    public String transposeString(String input) {
        int i = 0, j = 0;
        String[] words = input.split(" ");
        String output = "";
        for (i = 0; i < words.length; i++) {
            words[i].trim();
            output += new StringBuffer(words[i].trim()).reverse().toString();//transposing each word of a Paragraph
            output+=" ";
        }
        return output.trim();
    }
}
