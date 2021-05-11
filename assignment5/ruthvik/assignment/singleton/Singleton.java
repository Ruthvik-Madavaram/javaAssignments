package ruthvik.assignment.singleton;

public class Singleton {
	String memberVariable;
	public static Singleton initializeMemberVariable(String var) {
		Singleton s = new Singleton();
		//memberVariable = var;
		// instance variables cannot be accessed in static methods directly.
		return s;
	}
	public void printMemberVariable(String var) {
		memberVariable = var;
		System.out.println(memberVariable);
	}
	public static void main(String[] args) {
		Singleton s = new Singleton();
		Singleton.initializeMemberVariable("HELLO");
		s.printMemberVariable("HELLO");
	}

}
