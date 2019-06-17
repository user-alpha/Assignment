import java.util.Scanner;
class BankAccount{

    public static void main(String args[] )
    { 
	  Scanner scanner = new Scanner(System.in);
        int balance = 1234;
		int withdraw;
		int deposit;
		int pin; 
		String username;
              

		
		
		while(true)
        
		{
            
			 
		    System.out.println("Welcome");
			
	          System.out.println(""); 
	 
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for Cancel Transaction");
            int n = scanner.nextInt();
            switch(n)
            {
                case 1:
				System.out.println("");
                System.out.print("Enter money to be withdrawn:");
                withdraw = scanner.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
					System.out.println("");
                    System.out.println("Please collect your money");
                }
                else
                {System.out.println("");
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
				System.out.println("");
                System.out.print("Enter money to be deposited:");
              deposit = scanner.nextInt();
                balance = balance + deposit;
				System.out.println("");
                System.out.println("Your Money has been deposited successfully");
                System.out.println("");
                break;
 
                case 3:
				System.out.println("");
                System.out.println(" Your Balance is : Ghs" + balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}

