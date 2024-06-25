class DefaultConstructor
{
	int rollNum;
	String name;
	public DefaultConstructor()
	{
		System.out.println(rollNum+" "+name);
	}
	public static void main(String args[])
	{
		DefaultConstructor dc = new DefaultConstructor();
	}
}