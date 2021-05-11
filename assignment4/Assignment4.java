import java.util.Calendar;
import java.util.Scanner;

public class Assignment4 {
	public Calendar setCalendarInstance(String[] dmy) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, Integer.parseInt(dmy[0]));
		c.set(Calendar.MONTH, Integer.parseInt(dmy[1])-1);
		c.set(Calendar.YEAR, Integer.parseInt(dmy[2]));
		return c;
	}
	public void compute(String date1, String date2) {
		Calendar c1 = setCalendarInstance(date1.split("-"));
		Calendar c2 = setCalendarInstance(date2.split("-"));
		int yearDifference = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
		c1.add(Calendar.YEAR, yearDifference);
		Calendar c1BeforeThirtyDays = Calendar.getInstance();
		c1BeforeThirtyDays.set(c1.get(Calendar.YEAR),c1.get(Calendar.MONTH), c1.get(Calendar.DATE));
		c1BeforeThirtyDays.add(Calendar.DATE, -30);
		if(c1BeforeThirtyDays.compareTo(c2)>=0) {
			System.out.println("No Range");
		}
		else {
			Calendar c1AfterThirtyDays = Calendar.getInstance();
			c1AfterThirtyDays.set(c1.get(Calendar.YEAR),c1.get(Calendar.MONTH), c1.get(Calendar.DATE));
			c1AfterThirtyDays.add(Calendar.DATE, 30);
			System.out.print(c1BeforeThirtyDays.get(Calendar.DATE) + "-" +(c1BeforeThirtyDays.get(Calendar.MONTH)+1) + "-" + c1BeforeThirtyDays.get(Calendar.YEAR) + " " );
			if(c1AfterThirtyDays.compareTo(c2)>0)
				System.out.println(c2.get(Calendar.DATE) + "-" +(c2.get(Calendar.MONTH)+1) + "-" + c2.get(Calendar.YEAR));
			else
				System.out.println(c1AfterThirtyDays.get(Calendar.DATE) + "-" +(c1AfterThirtyDays.get(Calendar.MONTH)+1) + "-" + c1AfterThirtyDays.get(Calendar.YEAR) );
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assignment4 ex = new Assignment4();
		int testCases = sc.nextInt();
		sc.nextLine();
		while(testCases > 0) {
			String input = sc.nextLine();
			String[] dates = input.split(" ");
			ex.compute(dates[0],dates[1]);
			testCases--;
		}
		
	}

}
