class LargestOf3Num 
{
	public static void main(String[] args) 
	{
		int n1 = 20;
		int n2 = 30;
		int n3 = 40;
		int ans = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println(ans);
	}
}
