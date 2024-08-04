class HCF 
{
	public static void main(String[] args) 
	{
		int n1 = 12 ,n2 = 14;
		int small = n1<n2?n1:n2;
		while (true)
		{
			if (n1%small==0 && n2%small==0)
			{
				System.out.println("The HCF of" +n1+"and"+n2+"is: "+small);
				break;
			}
			small--;
		}
	}
}
