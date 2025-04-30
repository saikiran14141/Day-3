public class BillCalculator
{
	public static double calculateTotalWithTax(double amount, double taxpercent)
	{
	 return amount+(amount * taxpercent / 100);
	}	
	public static void main(String args[])
	{
	 System.out.println(BillCalculator.calculateTotalWithTax(1000,18));
	}
}