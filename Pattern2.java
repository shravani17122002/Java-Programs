import java.util.Scanner;

class Pattern2 
{
	public static void main(String[] args) 
	{
		/*int n =4;
		int a = 97;
		for (int i=1;i<=n;i++)
		{
			for (int j =1;j<=n;j++)
			{
				System.out.print((char)a+" ");
				 a++;
		    }
			System.out.println();
		}
		*/

  
        Scanner sc  = new Scanner (System.in);
		int count = 0 ;
		int num = sc.nextInt();

		for(char i = 'a' ; i< 'z' ; i++){
			System.out.print(i+" ");
         count++;

		 if(count % num == 0)
	     {
          
		  System.out.println();
		 }

		}
		   
		
		
	}
}
