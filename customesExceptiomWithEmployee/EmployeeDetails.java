package customesExceptiomWithEmployee;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Set;
import java.util.Scanner;
//this is Mainclass for creating and checking for emoplyee details

public class EmployeeDetails {
	
	public static void main(String[] args) throws InvalidData 
	{
		TreeMap<Integer,EmployeeList>employee=new TreeMap<Integer,EmployeeList>();

		EmployeeList e1= new EmployeeList(100,"Shravani",9912345674L,"developing",10000.0);
		EmployeeList e2 =new EmployeeList(101,"Rukshana",9874563210l,"developing",10000);
		EmployeeList e3= new EmployeeList(102,"Aruna",8106776938l,"Testing",20000);
		EmployeeList e4= new EmployeeList(103,"Vinay",6547891231l,"Hr",15000);
		employee.put(100,e1);
		employee.put(101, e2);
		employee.put(102, e3);
		employee.put(103, e4);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		try{
			int id=sc.nextInt();
		//Set s=employee.entrySet();
		//Iterator entry=s.iterator();
		
		//Map.Entry<Integer,EmployeeList> mp=(Entry<Integer, EmployeeList>) entry.next();
				if(!employee.containsKey(id))
			{
					try {
						throw new InvalidData("invalid employee id	");
					}
					catch(InvalidData e)
					{
						System.out.println("your enter "+e);
						System.out.println("Please enter correct employee id");
					}
			}
				else
				{
					System.out.println("welcome...");
					System.out.println(employee.get(id));
				}
				
		
			}catch(Exception e)
		{
				System.out.println(" employee id should be number");
		}
		}
	}

		
	

			
