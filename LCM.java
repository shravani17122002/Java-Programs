class LCM 
{
	public static void main(String[] args) 
	{
		int n1 = 23,n2 = 18;
		int big =n1>n2?n1:n2;
		int i = 1;
		while (true)
		{
			if ((big*i)%n1==0 && (big*i)%n2==0)
			{
				System.out.println("The LCM of" +n1+ "and" +n2+ "is: " +big);
				break;
			}
			big++;
		}
	}
}