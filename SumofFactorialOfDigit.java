import java.util.Scanner;
class SumofFactorialOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		int sum = 0;
		
		int rem;

		for(int i=n;i>0;i=i/10)
		{
			rem = i % 10;
			int prod = 1;

			for(int j=rem;j>0;j--)
			{
				prod = prod * j;
			}

			sum = sum + prod ;
		}
		System.out.println("Sum of Given Numbers Factorial : "+ sum );
	}
}
