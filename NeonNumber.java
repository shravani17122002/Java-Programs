import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int square = num*num;
		int sum = 0;
		while (square!=0)
		{
			int digit = square%10;
			sum = sum + digit;
			square/=10;
			if (num==sum)
			{
				System.out.println(num+"is the Neon Number");
				break;
			}
			else
			{
				System.out.println(num+"is not the Neon number");
			}
		}
	}
}
