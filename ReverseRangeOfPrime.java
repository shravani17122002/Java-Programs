import java.util.Scanner;
class ReverseRangeOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start: ");
		int start = sc.nextInt();
		System.out.println("Enter the End: ");
		int end = sc.nextInt();
		int i,j;
		
		for(i=end;i>start;i--)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(i);
	}
}
