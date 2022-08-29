package weeks_task;

import java.util.Scanner;

public class AnotherWay extends Creatingdays {
	String array[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday","sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	String name2;
	int num1;
	Scanner sc=new Scanner(System.in);
	int array1[]= {0,1,2,3,4,5,6};
	public void gettingAfterDays()
	{
		
		System.out.println("enter day");
		name2=sc.next();
		System.out.println("enter no of days");
		try {
		num1=sc.nextInt();
		int length=array.length-1;
			for(int i=0;i<=array.length-1;i++)
			{
				if(array[i].equals(name2))
				{
					if(num1%7==0)
					{
						System.out.println("After "+num1+" days "+array[i+7]+" will com");
						break;
					}
					else if(num1%7==1)
					{
						System.out.println("After "+num1+" days "+array[i+1]+"  will come");
						break;
					}
					else if(num1%7==2)
					{
						System.out.println("After "+num1+" days "+array[i+2]+" will come");
						break;
					}
					else if(num1%7==3)
					{
						System.out.println("After "+num1+" days "+array[i+3]+"  will come");
						break;
					}
					else if(num1%7==4)
					{
						System.out.println("After "+num1+" days "+array[i+4]+"  will come");
						break;
					}
					else if(num1%7==5)
					{
						System.out.println("After "+num1+" days "+array[i+5]+"  will come");
						break;
					}
					else if(num1%7==6)
					{
						System.out.println("After "+num1+" days "+array[i+6]+" will come");
						break;
					}
					
					}
				
			}
		}catch(Exception e) {
			System.out.println("number should be intger");
		}
		}
				
	int num;
	public void getday()
	{
		Scanner sc=new Scanner(System.in);
		try {
		name1=sc.next();
		}
		catch(Exception e){
			System.out.println("day name should be in string ");
		}
		
		
	}
	public void getPreviousDay()
	{
		
		System.out.println("enter day name for getting previous day");
		getday();
		
		for(int i=0;i<=array.length-1;i++)
		{
			if(name1.equals("sunday"))
			{
				System.out.println("previous day is "+array[array.length-1]);
				break;
			}
			
			else if(array[i].equals(name1))
			{
				System.out.println("previous day is "+array[--i]);
				break;
			}
			else if(array[i]==array[array.length-1]){
				System.out.println("please enter valid day name");
			}
		}
		
	}
	public void getNextDay()
	{
		
		System.out.println("enter day name for getting next day");
		getday();
		for(int i=0;i<=array.length-1;i++)
		{
			
			 if(array[i].equals(name1))
			{
				System.out.println("Nextday is "+array[++i]);
				break;
			}
			else if (array[i]==array[array.length-1]){
				System.out.println("enter valid day name");
			}
		}
	}
	public void gettingBeforeDyas()
	{
		try {
		System.out.println("enter day name"); 
		name2=sc.next();
		System.out.println("enter noof days before u want");
		num1=sc.nextInt();
		for(int i=array.length-1;i>=0;i--)
		{
			if(array[i].equals(name2))
			{
				for(int j=0;j<=array1.length-1;j++)
				{
					if(num1%7==j)
					{
						System.out.println("Before "+num1+" of "+name2+ " is "+ array[i-j]);
						break;
					}
				}
			}
		}
		
	}
catch(Exception e)
	{
	
	}
	
}
}
	


