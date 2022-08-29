package weeks_task;
import java.util.Scanner;

public class Creatingdays {
	/**create class is used for creating an array with days
	 * n used for storing length of an array
	 * name is used for stroing day name from get method
	 * name1 is for storing day name from AfterTheday method
	 * num is for storing no of days after from AfterTheDay()
	 */
	
	String array[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	int num1=array.length-1;
	String name;
	String name1;
	int num;
	public void getday()
	{
		Scanner sc=new Scanner(System.in);
		try {
		name=sc.next();
		}
		catch(Exception e){
			System.out.println("day name should be in string ");
		}
		
		
	}
	public void getPreviousDay()
	{
		
		System.out.println("enter day name for getting previous day");
		getday();
		
		for(int i=0;i<=num1;i++)
		{
			if(name.equals("sunday"))
			{
				System.out.println(array[num1]);
				break;
			}
			else if(array[i].equals(name))
			{
				System.out.println(array[--i]);
				break;
			}
			else if(array[i]==array[num1]){
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
			if(name.equals("saturday"))
			{
				System.out.println(array[0]);
				break;
			}
			else if(array[i].equals(name))
			{
				System.out.println(array[++i]);
				break;
			}
			else if(array[i]==array[num1]){
				System.out.println("enter valid day name");
			}
		}
	}
	public void AfterTheDay()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This is for getting days After how many days you want from the day");
		try {
		System.out.println("enter day name  ");
		name1=sc.next();
		System.out.println("enter how many days you want to add");
		num=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("enter valid data");
		}
		
			switch(name1)
			{
			case "sunday":{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After days monday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println(" After "+num+" tuesday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days wednesday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days friday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				break;
			}
			case "monday":
			{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After "+num+" days tuesday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println("After "+num+" days wednesday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days friday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days monday will come");
				}
				break;
			}
			case "tuesday":{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After "+num+" days wednesaday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days friday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days monday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days tuesday will come");
				}
				break;
			}
			case "wednesday":{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println("After "+num+" days friday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days monday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days tuesday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days wednesday will come");
				}
				break;
			
			}
			case "thursday":{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After "+num+" days friday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days monday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days thuesday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days wednesday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				break;
			}
			case "friday":
			{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days monday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days tuesday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days wednesday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days friday will come");
				}
				break;
			}
			case "saturday":
			{
				if(num==1||num==8||num==15||num==22||num==29||num==36||num==43||num==50||num==57||num==64||num==71||num==78||num==85||num==92||num==99)
				{
					System.out.println("After "+num+" days sunday will come");
				}
				else if(num==2||num==9||num==16||num==23||num==30||num==37||num==44||num==51||num==58||num==65||num==72||num==79||num==86||num==93||num==100)
				{
					System.out.println("After "+num+" days monday will come");
				}
				else if(num==3||num==10||num==17||num==24||num==31||num==38||num==45||num==52||num==59||num==66||num==73||num==80||num==87||num==94||num==101)
				{
					System.out.println("After "+num+" days tuesday will come");
				}
				else if(num==4||num==11||num==18||num==25||num==32||num==39||num==46||num==53||num==60||num==67||num==74||num==81||num==88||num==95||num==102)
				{
					System.out.println("After "+num+" days wednesday will come");
				}
				else if(num==5||num==12||num==19||num==26||num==33||num==40||num==47||num==54||num==61||num==68||num==75||num==82||num==89||num==96||num==103)
				{
					System.out.println("After "+num+" days thursday will come");
				}
				else if(num==6||num==13||num==20||num==27||num==34||num==41||num==48||num==55||num==62||num==69||num==76||num==83||num==90||num==97||num==104)
				{
					System.out.println("After "+num+" days friday will come");
				}
				else if(num==7||num==14||num==21||num==28||num==35||num==42||num==49||num==56||num==63||num==70||num==77||num==84||num==91||num==98||num==1059)
				{
					System.out.println("After "+num+" days saturday will come");
				}
				break;
			}
			default:System.out.println("enter valid day");
			}
	}
}
				
			
			
			
			
				
	
				
		

