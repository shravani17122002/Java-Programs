import java.util.Scanner;
class NthFib
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();

		int n1 = 0, n2=1, n3;

		for (int i=1;i<num ;i++)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		System.out.println(n1);
	}
}