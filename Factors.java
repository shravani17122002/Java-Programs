class Factors  
{
	public static void main(String[] args) 
	{
		int num = 10;
		int den = 1;
		while (den<=num/2)
		{
			if (num%den==0)
			{
				System.out.println(den);
			}
			den++;
		}
		System.out.println(num);
	}
}
