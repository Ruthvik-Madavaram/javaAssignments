import java.util.Scanner;

class Teenage extends Exception{
	public Teenage(String msg) {
		super(msg);
	}
}
class AdultAge extends Exception{
	public AdultAge(String msg) {
		super(msg);
	}
}
class SeniorCitizen extends Exception{
	public SeniorCitizen(String msg) {
		super(msg);
	}
}
class Driving{
	public void show() {
		Scanner sc = new Scanner(System.in);
		String age = sc.nextLine();
		try {
			if(Integer.parseInt(age) < 18)
				throw new Teenage("Cannot Apply For Driving License");
			else if(Integer.parseInt(age) > 18 && Integer.parseInt(age) < 60)
				throw new AdultAge("Don't Drink and Drive");
			else if(Integer.parseInt(age) > 60)
				throw new SeniorCitizen("Cannot drive safely");
			else if(age.isEmpty())
				throw new NullPointerException();
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
		
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		Driving d = new Driving();
		d.show();

	}

}
