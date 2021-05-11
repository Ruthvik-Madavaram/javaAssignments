package assignment6;

public class ArrayOfObjectReferences {
	String memberVariable;
	public ArrayOfObjectReferences(String argument) {
		memberVariable = argument;
		System.out.println(memberVariable);
	}
	ArrayOfObjectReferences[] ref = new ArrayOfObjectReferences[3];
	public static void main(String[] args) {
		ArrayOfObjectReferences aor = new ArrayOfObjectReferences("Hello");
		System.out.println(aor.ref);
		for(int i = 0; i < 3; i++)
			aor.ref[i] = new ArrayOfObjectReferences("Hello "+(i+1));
	}

}
