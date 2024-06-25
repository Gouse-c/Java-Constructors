class ConstructorOverloading
{
	int rollNum;
	String name;
	double fees;
	public ConstructorOverloading(int rollNum,String name)
	{
		System.out.println(rollNum+" "+name);
	}
	public ConstructorOverloading(int rollNum,String name,double fees)
	{
		System.out.println(rollNum+" "+name+" "+fees);
	}
	public static void main(String args[])
	{
		ConstructorOverloading c1=new ConstructorOverloading(101,"Gouse");
		ConstructorOverloading c2=new ConstructorOverloading(102,"Ravi",75000.00);
	}
}