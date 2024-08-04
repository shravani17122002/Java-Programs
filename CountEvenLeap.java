import java.util.Scanner;
class CountEvenLeap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting year:");
		int startyear = sc.nextInt();
		System.out.println("Enter the ending year:");
		int endyear = sc.nextInt();
		int count = 0;

		for( int year = startyear; year <= endyear; year++)
		{
			if ((year%4==0&&year%100!=0) || year%400==0&&year%2==0)
			{
				System.out.println(year);

			}
			count++;
		}
		System.out.println("Count of leap year from" +startyear+ "and" +endyear+ "is:" +count);
		
	}
}
