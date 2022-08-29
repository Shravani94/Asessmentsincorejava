package weeks_task;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args)throws Exception
	{
		try {
			AnotherWay an=new AnotherWay();
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("enter 1 for nextDay/enter 2 for previousday/enter 3 for afterdays/ enter 4 for Before days");
			int num3=sc.nextInt();
			switch(num3) {
			case 1:System.out.println("your selecting  for nextday");
			an.getNextDay();
			break;
			case 2:System.out.println("your selecting for previousday");
			an.getPreviousDay();
			break;
			case 3:System.out.println("your entered for afterdays");
			an.gettingAfterDays();
			break;
			case 4:System.out.println("your enter for before days");
			an.gettingBeforeDyas();
			break;
			default:System.out.println("your entered incorrect number");
			}
			}
			
			}catch(Exception e) {
				System.out.println(e);
			}
			}
}
			
			
			
			
	


