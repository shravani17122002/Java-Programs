import java.util.Scanner;
class RangeOfArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting: ");
		int start =sc.nextInt();
		System.out.println("Enter the Ending: ");
		int end = sc.nextInt();

		for(int i=start;i<=end;i++)
		{
			int count =0;
			int sum =0;
			for(int j=i;j>0;j/=10)
			{
				int rem = j % 10;
				count++;
			}

			for(int j=i;j>0;j/=10)
			{
				int rem = j % 10;
				int prod = 1;

				for(int k=1;k<=count;k++)
				{
					prod = prod * rem ;
				}
				sum = sum + prod ;
			}

			if(i == sum)
			{
				System.out.println(i + " It is an Armstrong Number Prsent in range of " + s + " and " + e);
			}
		}
	}
}
