import java.util.*;
public class gl {

	Scanner sc = new Scanner(System.in);

	// function to check palindrome

	public void checkPalindrome() {
		Scanner inp= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= inp.nextInt();

		int reverse=0, element, remainder; 
		element = num;

		for( ;num!=0;num/=10){
			remainder= num % 10;
			reverse = (reverse * 10) + remainder;
		}

		if (element == reverse){
			System.out.println("Yes, it is palindrome");
		}
		else{
			System.out.println("No, it is not palindrome");
		}
	}

	// function to print pattern

	public void printPattern() {
		Scanner rw = new Scanner(System.in);
		System .out.println("give the number of rows : ");
		int i, j, row;
		row = rw.nextInt();
		for(i= row-1; i>=0 ; i--)   
		{   
			for(j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}			
	}

	// function to check number is prime or not

	public void checkPrimeNumber() {
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

	// function to print fibonacci series

	public void printFibonacciSeries() {
		int n, a = 0, b = 0, c = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n:");
		n = s.nextInt();
		System.out.print("Fibonacci Series:");
		for(int i = 1; i <= n; i++)
		{
			a = b;
			b = c;
			c = a + b;
			System.out.print(a+" ");
		}
	}

	//main method which contains switch and do while loop

	public static void main(String[] args) {

		gl obj = new gl();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {



			case 0:

				choice = 0;

				break;



			case 1: {

				obj.checkPalindrome();

			}

			break;



			case 2: {



				obj.printPattern();

			}

			break;



			case 3: {

				obj.checkPrimeNumber();

			}

			break;



			case 4: {



				obj.printFibonacciSeries();

			}

			break;



			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}



		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}



}