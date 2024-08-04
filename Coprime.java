import java.util.Scanner;
class Coprime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 =sc.nextInt();
        nn int small = n1<n2?n1:n2;
		while (true)
		{
			if (n1%small==0 && n2%small==0)
			{
				if (small==1)
				{
					System.out.println(n1+ "and" +n2+"are coprime numbers!");
					
				}
				else
				{
					System.out.println(n1+ "and" +n2+"are not coprime numbers!");
				}
				
			break;	
			}
			small--;
		}
	}
}
