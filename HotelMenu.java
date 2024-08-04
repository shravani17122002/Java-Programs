import java.util.Scanner;
class HotelMenu
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("---------Welcome to Hotel Majestic Manner-----------");
		System.out.println("Select the Menu:");
		System.out.println("1.Vegetarian!");
		System.out.println("2.Non vegetarian!");

		int i = sc.nextInt();

		switch(i)
		{
			case 1: 
				{
					System.out.println("For Vegiterian");
					System.out.println("1) Shevbhaji : 120 Rs");
					System.out.println("2) Paneer : 200 Rs");
					System.out.println("3) Malaikofta : 220 Rs");
					System.out.println("4) Veg pulav : 150 Rs");
                    System.out.println("5)Dal tadka: 110Rs");
					
					
					int menu = sc.nextInt();
					switch (menu)
					{
					case 1 : 
						{ 
						System.out.println("Thank you for ordering ShevBhaji!");
						break;
						}
					case 2:
						{
						System.out.println("Thank you for ordering Paneer!");
						break;
						}
					case 3:
						{
						System.out.println("Thank you for ordering Malaikofta!");
						break;
						}
					case 4:
						{
						 System.out.println("Thank you for ordering Veg pulav!");
						 break;
						}
					case 5:
						{
							System.out.println("Thank you for ordering Dal tadka!");
							break;
						}
					default: 
						{
						System.out.println("Invalid Order!");
						}
					}
				break;	
			}
			
			case 2: 
				{
					System.out.println("For Non Vegiterian");
					System.out.println("1) Anda Kari : 90 Rs");
					System.out.println("2) Mutton thali : 450 Rs");
					System.out.println("3) Chicken Thali : 300 Rs");
					System.out.println("4) Fish fried : 350 Rs");
					System.out.println("5):Fish curry: 210 Rs");

					int menu = sc.nextInt();
					switch (menu)
					{
					case 1 : 
						{ 
						System.out.println("Thank you for ordering Anda Kari!");
						break;
						}
					case 2:
						{
						System.out.println("Thank you for ordering Mutton Thali!");
						break;
						}
					case 3:
						{
						System.out.println("Thank you for ordering Chicken Thali!");
						break;
						}
					case 4:
						{
							System.out.println("Thank you for ordering Fish Fried!");
							break;
						}
					case 5:
						{
							System.out.println("Thank you for ordering Fish Curry!");
							break;
						}
					default: 
						{
						System.out.println("Invalid Order!");
						}
					}
				break;	
			}
			default: 
			{
				System.out.println("You need Something Different");
			}
		}
	}
}

