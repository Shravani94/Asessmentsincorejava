package customesExceptiomWithEmployee;
//this class is an user defined exception class 

public class InvalidData extends Exception {
	String s;
	public InvalidData(String s)
	{
		super(s);
		this.s=s;
	}
	public String toString()
	{
		return s;
	}

}
