import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		
		/**
		System.out.println("I like fried Chicken!!!");
		System.out.println("It tastes really good!!!");
		System.out.println();
		System.out.println();
		**/
		
		/**
		 * Tutorial #2 Variables
		 */
		/**
		
		int x = 123; // declarations
		long xl= 1928292829282928232L;
		float f=3.14f;
		double d=12.322322322;
		char symbol= '@';
		String name="My name";
				
		System.out.println("My number is: "+x);
		System.out.println("My long number is: "+xl);
		System.out.println("My float number is: "+f);
		System.out.println("My double number is: "+d);
		System.out.println("My symbol is: "+symbol);
		System.out.println("Hello, my name is: "+name);
		System.out.println();
		System.out.println();
		**/
		
		/**
		 * Tutorial #3 Swap two variable
		 */
		
		/**
		String s_water="water";
		String s_kool_aid= "Kool-aid";
		String temp;
		
		temp=s_water;
		s_water=s_kool_aid;
		s_kool_aid=temp;
		
		System.out.println("s_water is: "+s_water);
		System.out.println("s_kool_aid is : "+s_kool_aid);
		System.out.println();
		System.out.println();
		**/
		
		/**
		 * Tutorial #4 User Input
		 */
		
		/**
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name_input =scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt(); //Only receives a integer
		scanner.nextLine();
		
		System.out.println("What is your favorite food?");
		String food= scanner.nextLine();
		
		System.out.println("Hello "+name_input+"!!");
		System.out.println("You are "+age+" years old.");
		System.out.println("You like "+food+" !!");
		**/
		
		/**
		 * Tutorial #5 Expressions
		 */
		
		/**
		double friends =10;
		friends++;
		friends=(double)friends/3;
		System.out.println(friends);
		**/
		
		/**
		 * Tutorial #6 GUI Intro
		 */
		
		String name= JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your height is "+height+" m tall.");
	}

}