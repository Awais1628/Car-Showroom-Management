import java.util.Scanner;

class Vehicle{
	private String brand="";
	private String brand1="";
	private String brand2="";
	
	void get_brand() {
        this.brand="Honda";
		System.out.println(brand);
	}
	
	void get_brand1() {
        this.brand1="BMW";
		System.out.println(brand1);
	}
	
	void get_brand2() {
        this.brand2="Audi";
		System.out.println(brand2);
	}
	
}


class MainMenu{
	void Menu() {
		System.out.println("**********************");
		System.out.println("Welcome to AS Showroom");
		System.out.println("h: honda");
		System.out.println("b: bmw");
		System.out.println("a: audi");
		System.out.println("e: EXIT");
		System.out.println("**********************");
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Honda h = new Honda();
		BMW b = new BMW();
		Audi a = new Audi();
		MainMenu m = new MainMenu();
		

		while(true){
		
			m.Menu();
			char temp, choice, option, op;
		int opt;
		
		System.out.print("Select the Company/Brand: ");
		choice = scan.next().charAt(0);
		
		switch (choice) {
		case 'h':
			System.out.println("Select from New or Old Car");
			System.out.println("Press 'O' for Old Car and 'N' for New Car: ");
			option = scan.next().charAt(0);
			if (option == 'o' || option == 'O') {
				System.out.println("Old Cars");
				h.get_OldCars();
				System.out.println("Do You Want to Buy a Car (y/n): ");
				op = scan.next().charAt(0);
				if (op =='y') {
					System.out.print("Which car: ");
					opt = scan.nextInt();
					if(opt==1||opt==2)
						System.out.println("Congratulations....!");
					
					System.out.print("Do You Want to Buy a Car Again (y/n): ");
					temp = scan.next().charAt(0);
					if(temp=='y'){
            		  continue;
					}
					else if(temp=='n'){
						System.out.println("Exit....");
						System.exit(0);
					}
				}
				else if(op=='n'){
                 continue;
				}
				
			}
			else if (option == 'n' || option=='N') {
				System.out.println("New Cars");
				h.get_NewCars();
				System.out.println("Do You Want to Buy a Car (y/n): ");
				op = scan.next().charAt(0);
				if (op =='y') {
					System.out.print("Which car: ");
					opt = scan.nextInt();
					if(opt==1||opt==2)
						System.out.println("Congratulations....!");
					
					System.out.print("Do You Want to Buy a Car Again (y/n): ");
					temp = scan.next().charAt(0);
					if(temp=='y'){
            		   continue;
					}
					else if(temp=='n'){
						System.out.println("Exit....");
						System.exit(0);
					}
				}
					else if(op=='n'){
						System.out.println("Exit....");
                      System.exit(0) ;
					}
				}
									
								
			
			case 'b':
			System.out.println("Select from New or Old Car");
			System.out.println("Press 'O' for Old Car and 'N' for New Car: ");
			option = scan.next().charAt(0);
			if (option == 'o' || option == 'O') {
				System.out.println("Old Cars");
				h.get_OldCars();
				System.out.println("Do You Want to Buy a Car (y/n): ");
				op = scan.next().charAt(0);
				if (op =='y') {
					System.out.print("Which car: ");
					opt = scan.nextInt();
					if(opt==1||opt==2)
						System.out.println("Congratulations....!");
					
					System.out.print("Do You Want to Buy a Car Again (y/n): ");
					temp = scan.next().charAt(0);
					if(temp=='y'){
            		continue;
					}
					else if(temp=='n'){
						System.out.println("Exit....");
						System.exit(0);
					}
				}
				else if(op=='n'){
					continue;
				   }
				
			}
			else if (option == 'n' || option=='N') {
				System.out.println("New Cars");
				b.get_NewCars();
				System.out.println("Do You Want to Buy a Car (y/n): ");
				op = scan.next().charAt(0);
				if (op =='y') {
					System.out.print("Which car: ");
					opt = scan.nextInt();
					if(opt==1||opt==2)
						System.out.println("Congratulations....!");
					
					System.out.print("Do You Want to Buy a Car Again (y/n): ");
					temp = scan.next().charAt(0);
					if(temp=='y'){
           		continue;
					}
					else if(temp=='n'){
						System.out.println("Exit....");
						System.exit(0);
					}
				}
					else if(op=='n'){
						System.out.println("Exit....");
                      System.exit(0) ;
					}
				}
			
				case 'a':
			System.out.println("Select from New or Old Car");
			System.out.println("Press 'O' for Old Car and 'N' for New Car: ");
			option = scan.next().charAt(0);
			if (option == 'o' || option == 'O') {
				System.out.println("Old Cars");
				h.get_OldCars();
				
				System.out.println("Do You Want to Buy a Car (y/n): ");
				op = scan.next().charAt(0);
				if (op =='y') {
					System.out.print("Which car: ");
					opt = scan.nextInt();
					if(opt==1||opt==2)
						System.out.println("Congratulations....!");
					
					System.out.print("Do You Want to Buy a Car Again (y/n): ");
					temp = scan.next().charAt(0);
					if(temp=='y'){
          		continue;
					}
					else if(temp=='n'){
						System.out.println("Exit....");
						System.exit(0);
					}
				}
				else if(op=='n'){
					continue;
				   }
				
			}
			else if (option == 'n' || option=='N') {
				System.out.println("New Cars");
				a.get_NewCars(2);
				System.out.println("Do You Want to Buy a Car (y/n): ");
				op = scan.next().charAt(0);
				if (op =='y') {
					System.out.print("Which car: ");
					opt = scan.nextInt();
					if(opt==1||opt==2)
						System.out.println("Congratulations....!");
					
					System.out.print("Do You Want to Buy a Car Again (y/n): ");
					temp = scan.next().charAt(0);
					if(temp=='y'){
//	            		
					}
					else if(temp=='n'){
						System.out.println("Exit....");
						System.exit(0);
					}
				}
					else if(op=='n'){
						System.out.println("Exit....");
                      System.exit(0) ;
					}
				}
				case'e':
				System.out.println("----------Exited--------");
				System.exit(0) ;
			
				


		default:
			System.out.println("Try again! Choose correctly");
			break;
		}
    }

	}

}
