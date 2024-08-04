import java.util.Scanner;
class PerfectPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int rem ;
		int reverse = 0;
		int i, j, k;

		for (i = 2; i < n ; i++ )
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (n == i)
		{
			System.out.println("It is Prime Number:" +n);
			for ( k = n; k > 0 ; k = k/10)
			{
				 rem = k % 10;
				 reverse = reverse * 10 + rem; 
			}
			System.out.println("Reverse number of given prime number is:"+reverse);

			for (j = 2; j < reverse ; j ++ )
			{
				if (reverse % j == 0)
				{
					break;
				}
			}
			if (reverse  == j)
			{
				System.out.println("It is perfect prime number where given number is prime and its reverse number is also prime");
			}
			else 
			{
				System.out.println("It is not a Perfect Prime Number");
			}
		}
	}
}
