package weeks_task;

import java.util.*;

public class FindDayName {

	private String dayName;

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public String getDayName() {
		return this.dayName;

	}

	public static void main(String[] args) {

		String[] dayNames = { "SUN", "MON", "TUE", "WED", "THUR", "FRI", "SAT" };

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the dayName:");

		String s = sc.nextLine();

		System.out.println("enter no of days:");

		int n = sc.nextInt();

		FindDayName dayName = new FindDayName();

		dayName.setDayName(s);

		System.out.println("Next Day:");
		dayName.getNextDay(s, dayNames);

		System.out.println("Previous Day:");
		dayName.getPreviousDay(s, dayNames);

		System.out.println("Day after no of days:");
		dayName.addToCurrentDay(n, dayNames, s);
	}

	public void getNextDay(String s, String[] dayNames) {

		for (int i = 0; i < dayNames.length; i++) {
			if (i == 6) {
				String st = dayNames[0];
				System.out.println(st);
				break;
			}
			if (dayNames[i].equals(s)) {
				String str = dayNames[i + 1];
				System.out.println(str);
				break;

			}

		}

	}

	public void getPreviousDay(String s, String[] dayNames) {

		for (int i = 1; i < dayNames.length; i++) {

			if (dayNames[i].equals(s)) {
				String str = dayNames[i - 1];
				System.out.println(str);
				break;
			}

			if (dayNames[i - 1].equals(s)) {
				System.out.println(dayNames[6]);
				break;
			}

		}
	}

	public void addToCurrentDay(int n, String[] dayNames, String s) {
		String str = null;

		for (int i = 0; i < dayNames.length; i++) {
			if (dayNames[i].equals(s)) {
				if (n < 0) {
//					
					int rem = n % 7;

					int minus = 7 + rem;
					int value = i + minus;
					value = value % 7;
					System.out.println(dayNames[value]);
					break;

				}

				int plus = i + n;

				if (plus < 7) {

					str = dayNames[plus];
					System.out.println(str);
					break;
				} else {
					int rem = plus % 7;
					str = (dayNames[rem]);
					System.out.println(str);
					break;
				}
			}
		}
	}

}