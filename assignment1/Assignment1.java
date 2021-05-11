import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
class PatternSearch{
	private String pattern;

	public PatternSearch(String pattern) {
		this.pattern = pattern;
	}
	ArrayList<String> filePaths = new ArrayList<String>();
	public void search(File[] files) {
		for(File file: files) {
			if(file.isDirectory())
				search(file.listFiles());
			else if(Pattern.matches(pattern, file.getName()))
				filePaths.add(file.getAbsolutePath());
		}
	}
	
	public void printFiles() {
		for(int i = 0;i<filePaths.size();i++) {
			System.out.println(filePaths.get(i));
		}
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String homeDirectory = System.getProperty("user.home");
		File files = new File(homeDirectory);
		File[] filesInDirectory = files.listFiles();
		System.out.println("Enter pattern of the files to search: ");
		String pattern = sc.nextLine();
		PatternSearch search = new PatternSearch(pattern);
		search.search(filesInDirectory);
		search.printFiles();
	}

}
