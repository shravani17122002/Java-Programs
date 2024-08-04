import java.util.Scanner;
class NthFibPrime
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int den;
		int n1 = 0, n2=1, n3;

		for (int i=1;i<num ;i++)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		System.out.println(n1);
		
		for (den=2;den<num ;den++ )
		{
			if (den%num==0)
			{
			break;
			}
		}
		if (n1 == den)
			{
				System.out.println("It is"+den+" a prime number");
			}
		else 
		{
				System.out.println("It is not a prime number");
		}

		if (n1==den)
		{
				System.out.println("The Fibonacci of "+num+" is "+n1+" and it is prime number");
		}
	}
}