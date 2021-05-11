import java.util.HashSet;
import java.util.Scanner;
public class Assignment2 {

	public boolean containsAllLetters(String string) {
		HashSet<Character> alphabets =new HashSet<Character>();
		string = string.toLowerCase();
		for(int i = 0; i<string.length();i++) {
			char ch = string.charAt(i);
			int ascii = (int)ch;
			if(ascii >= 97 && ascii <=122)
				alphabets.add(ch);
		}
		if(alphabets.size() == 26)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		Assignment2 ex = new Assignment2();
		if(ex.containsAllLetters(string))
			System.out.println("All characters are present");
		else
			System.out.println("All Characters are not present");
	}

}
