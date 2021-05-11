package assignment11;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;



public class CharacterCount {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(args[0]);
		int i;
		HashMap<Character,Integer> characterCounts = new HashMap<Character,Integer>();
		FileWriter fw=new FileWriter("output.txt");
		while ((i=fr.read())!= -1)
		{
		    char ch=(char)i;
		    if(characterCounts.containsKey(ch))
		    	characterCounts.put(ch,characterCounts.get(ch)+1);
		    else
		    	characterCounts.put(ch,1);
		}

		for(Character ch: characterCounts.keySet())
		{
		    fw.write(ch+":"+characterCounts.get(ch)+"\n");
		}
		fr.close();
		fw.close();
	    
	}
}
