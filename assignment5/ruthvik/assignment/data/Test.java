package ruthvik.assignment.data;

public class Test {
	int variable1;
	char variable2;
	public void printMemberVariables() {
		System.out.println("Integer variable " + variable1);
		System.out.println("Character variable " + variable2);
	}
	
	public void printLocalVariables() {
		int localVariable1;
		char localVariable2;
		/*
		System.out.println("Integer local variable: "+localVariable1);
		System.out.println("Character local Variable: "+ localVariable2);
				In JAVA local variables must me initialized before using them.
				Otherwise it gives a compile time error.
		*/
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.printMemberVariables();
		
	}

}
