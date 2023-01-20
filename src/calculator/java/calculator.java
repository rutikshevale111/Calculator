package calculator.java;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1,num2,option;
		option = 0;
		while(option!=6) {
			System.out.print("Enter 1st number: ");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number: ");
			num2 = sc.nextInt();
			System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4.division \n5.modulus \n6.Exit");
			option = sc.nextInt();
			switch(option) {
			case 1: System.out.println("Addition: "+(num1+num2));
			break;
			case 2: System.out.println("Substraction: "+(num1-num2));
			break;
			case 3: System.out.println("Multiplication: "+(num1*num2));
			break;
			case 4: System.out.println("Division : "+(num1/num2));
			break;
			case 5: System.out.println("Modulus: "+(num1%num2));
			break;
			case 6: System.exit(0);
			break;
			default: System.out.println("User enter wrong choise..!!!");
			
			}
		}

	}

}
