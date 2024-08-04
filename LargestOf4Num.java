class LargestOf4Num  
{
	public static void main(String[] args) 
	{
		int n1 = 30;
		int n2 = 45;
		int n3=  60;
		int n4 = 15;
		int large1 = n1>n2?n1:n2;
		int large2 = n3>n4?n3:n4;
		int largest =large1>large2?large1:large2;
		System.out.println(largest);
	}
}
