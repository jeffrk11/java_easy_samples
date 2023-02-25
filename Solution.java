import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = 4;
		while(testCases>0){
			String line = 
            "<h1>some</h1>\n"+
            "<h1>had<h1>public</h1></h1>\n"+
            "<h1>had<h1>public</h1515></h1>\n"+
            "<h1><h1></h1></h1>";
		
            process(line);
			
			testCases--;
		}
	}

    private static void process(String text){
        String auxtext = "";
        String currentTag = "", nextTag;
        int count = 0;
        while(count < text.length()){
            auxtext += text.charAt(count);
            //is it a tag
            if(text.charAt(count) == '<'){
                String temptag = findTag(count, text);
                if(validTag(temptag)){
                    if(currentTag.equals(temptag)){

                    }
                    currentTag = temptag;
                    auxtext = "";
                    count += currentTag.length() -1;
                }
            }
            count++;
        }
    }
    private static String findTag(int index, String line){
        //next close tag
        int closetag = line.indexOf('>',index);
        return closetag == -1 ? null : line.substring(index, closetag+1);
    }

    private static boolean validTag(String text){
        if(text.charAt(0) != '<')
            return false;
        if(text.charAt(text.length()-1) != '>')
            return false;
        if(text.equals("<>") || text.equals("</>"))
            return false;
        
        return true;
    }

    private static boolean isSameTags(String tagOpen, String tagClose){
        
    }

}