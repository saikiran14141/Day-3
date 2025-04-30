public class TravelConverter
{
	public static double kmToMile(double km)
	{
	 return km * 0.621371;
	}
	public static void main(String args[])
	{
	 System.out.println(TravelConverter.kmToMile(25));
	}

}