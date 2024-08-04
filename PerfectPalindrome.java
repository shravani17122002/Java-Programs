import java.util.Scanner;
class PerfectPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int total = 0;
		for (int i =1;i<=num/2;i++)
		{
			if (num%i==0)
			{
				total+=i;
			}
		}
		if (total==num)
		{
			int rev = 0;
			for (int i=num;i!=0;i/=10)
			{
				rev = rev*10+(i%10);
			}
			if (rev==num)
			{
				System.out.println("It is a perfect palindrome number");
			}
			else
			{
				System.out.println("It is a perfect but not palindrome number");
				
			}
		}
		else
		{
			int sum = 0;
			while (num!=0)
			{
				sum += (num%10);
				num/=10;
				
		    }
			System.out.println("It is not perfect number, so the sum of digit is"+sum);
		}
	}
}
