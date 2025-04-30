public class CurrencyConverter
{
	public static double rupeesToUSD(double rupees)
	{
	 return rupees / 83.0;
	}
	public static void main(String ars[])
	{
	 System.out.println(CurrencyConverter.rupeesToUSD(3500));
	}
}