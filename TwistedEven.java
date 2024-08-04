import java.util.Scanner;
class TwistedEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		int reverse =0;
		if (num%2==0)
		{
			while (num>0)
			{
				int last = num%10;
				reverse = reverse*10+last;
				num/=10;
				if (reverse%2==0)
				{
					System.out.println("The Numbers are twisted even !");
				}
				else
				{
					System.out.println("The numbers are not twisted even!");
				}
				
			}
		}
		else
		{
			System.out.println("The number is not even!");
		}
	}
}
