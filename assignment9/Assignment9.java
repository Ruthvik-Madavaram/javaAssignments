import java.util.Scanner;
import java.util.regex.Pattern;

class CheckPattern{
	public void solve() {
		String pattern = "^[A-Z].*[.]$";
		System.out.println("Enter any sentence");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		if(Pattern.matches(pattern, input)) {
			System.out.println("Sentence starts with capital and ends with period");
		}
		else {
			System.out.println("Sentence does not start with capital letter or end with period");
		}
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		CheckPattern cp =new CheckPattern();
		cp.solve();

	}

}
