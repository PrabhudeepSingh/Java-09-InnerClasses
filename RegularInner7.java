class RegularInner7
{
	interface Vehicle
	{
		public int getNoOfWheels();
	}

	class Bus implements Vehicle
	{
		public int getNoOfWheels()
		{
			return 6;
		}
	}
	
	class Auto implements Vehicle
	{
		public int getNoOfWheels()
		{
			return 3;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(new RegularInner7().new Bus().getNoOfWheels());  //6
		System.out.println(new RegularInner7().new Auto().getNoOfWheels()); //3
	}
}