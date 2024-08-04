import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(system.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int den = 2;
		while (den<num)
		{
			if (num%den==0)
			{
				break;
			}
        if (num==den)
        {
			int rev = 0;
			while (num!=0);
			{
				int last = num%10;
				rev = rev*10+last;
				num/=10;
			}
			System.out.println("It is a prime number!");
        }
		else 
			{
				System.out.println("It is not prime number!");
			}
		}
		if ()
		{
		}
	}
}
