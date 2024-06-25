class ParametrizedConstructor
{
	int rollNum;
	String name;
	public ParametrizedConstructor(int rollNum,String name)
	{
		System.out.println(rollNum+" "+name);
	}
	public static void main(String args[])
	{
		ParametrizedConstructor pc = new ParametrizedConstructor(101,"Gouse");
		ParametrizedConstructor pc1 = new ParametrizedConstructor(102,"Vamsi");
		ParametrizedConstructor pc2 = new ParametrizedConstructor(103,"Surendra");
		
	}
}