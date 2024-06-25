class VehiclesConstructor
{
	int vehicleNum;
	String name;
	int manufactured;
	public VehiclesConstructor(int vehicleNum,String name,int manufactured)
	{
		vehicleNum=vehicleNum;
		name=name;
		manufactured=manufactured;
	}
	void result()
	{
		System.out.println(vehicleNum+" "+name+" "+manufactured);
	}
	public static void main(String args[])
	{
		VehiclesConstructor v1 = new VehiclesConstructor(7896,"Audi",2020);
		VehiclesConstructor v2 = new VehiclesConstructor(5478,"Volvo",2005);
		VehiclesConstructor v3 = new VehiclesConstructor(9654,"BMW",2016);
		v1.result();
		v2.result();
		v3.result();
	}
}