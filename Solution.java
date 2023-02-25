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
            "<h1>some</h1>"+
            "<h1>had<h1>public</h1></h1>"+
            "<h1>had<h1>public</h1515></h1>"+
            "<h1><h1></h1></h1>";
		
            process(line);
			
			testCases--;
		}
	}

    private static void process(String text){
        String auxtext = "";
        String lastTag = "", nextTag;
        int count = 0;
        while(count < text.length()){
            auxtext += text.charAt(count);
            //is it a tag
            if(text.charAt(count) == '<'){
                String temptag = findTag(count, text);
                if(validTag(temptag)){
                    count += temptag.length() -1;
                    if(validTags(lastTag, temptag)){
                        System.out.println(auxtext.substring(0,auxtext.length()-1));
                        temptag = "";
                    }
                    lastTag = temptag;
                    auxtext = "";
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
        if(text.length() == 2 || text.length() == 0)
            return false;
        if(text.contains("/") && text.length() == 3)
            return false;
        if(text.charAt(0) != '<')
            return false;
        if(text.charAt(text.length()-1) != '>')
            return false;
        if(text.equals("<>") || text.equals("</>"))
            return false;
        
        return true;
    }

    private static boolean validTags(String tagOpen, String tagClose){
        if(tagOpen.isBlank() ||tagClose.isBlank())
            return false;
        //<h1>
        //first 
        if(tagOpen.contains("</"))
            return false;
        
        //</h1>
        if(!tagClose.contains("</"))
            return false;

        if(!tagOpen.substring(1, tagOpen.length()-1).equals(tagClose.substring(2, tagClose.length()-1))){
            System.out.println("None");
            return false;
        }
        
        return true;
    }


}