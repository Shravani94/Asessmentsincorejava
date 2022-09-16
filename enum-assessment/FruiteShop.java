package enum_assessment;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

enum fruites {
	ORANGE(80), GRAPES(60), APPLE(180), KIWI(200);

	fruites(int price) {
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	int price;

}

public class FruiteShop {
	static double totalBill = 0;

	Scanner sc = new Scanner(System.in);
	static {
		fruites[] fruit = fruites.values();
		for (fruites f : fruit) {
			System.out.println(f + "---->" + f.getPrice());
		}
	}

	public void billing() {
		char ch;
		do {
			System.out.println("enter what are the fruites you want");
			String name = sc.next();

			fruites[] fruite = fruites.values();
			List<String> fruiteList = Stream.of(fruites.values()).map(fruites::name).collect(Collectors.toList());
			if (fruiteList.contains(name)) {
				System.out.println("enter how many grams you want");
				int num = sc.nextInt();
				double price = fruites.valueOf(name).getPrice();
				double bill = (price * num) / 1000;
				System.out.println("For " + num + " grams of " + name + " is " + bill + " rupees");
				totalBill = totalBill + bill;

			} else {
				System.out.println("Sorry,these fruites are not available");
			}
			System.out.println("Do you want you buy any more if yes ress Y /else press N");
			ch = sc.next().charAt(0);
		} while (ch != 'N');
		System.out.println("your total bill is " + totalBill);
		System.out.println("thank you for visiting please come again");

	}

	public static void main(String[] args) {
		FruiteShop fruites = new FruiteShop();
		fruites.billing();

	}
}
