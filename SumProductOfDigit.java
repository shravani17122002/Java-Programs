import java.util.Scanner;
class SumProductOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		int sum = 0;
		int product=1;
		while (num>0)
		{
			int rem =num%10;
			sum = sum + rem;
			product=product*rem;
			num = num /10;
			
		}
		System.out.println("The Sum is"+sum);
		System.out.println("The product is"+product);
			if (sum==product)
			{
               System.out.println("The Sum of digit and product of digit are same");
			}
			else
			{
				System.out.println("The Sum of digit and product of digit are not same");
			}

		

		
	}
}
