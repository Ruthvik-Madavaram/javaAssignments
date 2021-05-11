package ruthvik.assignment.main;

import ruthvik.assignment.data.Test;
import ruthvik.assignment.singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		t.printMemberVariables();
		Singleton s = new Singleton();
		s.printMemberVariable("HELLO");
		
	}

}
