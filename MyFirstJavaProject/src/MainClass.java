import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		/**
		 * Java tutorial for beginners
		 */
		
		/*
		System.out.println("I like fried Chicken!!!");
		System.out.println("It tastes really good!!!");
		System.out.println();
		System.out.println();
		*/
		
		/**
		 * Tutorial #2 Variables
		 */
		/*
		
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
		*/
		
		/**
		 * Tutorial #3 Swap two variable
		 */
		
		/*
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
		*/
		
		/**
		 * Tutorial #4 User Input
		 */
		
		/*
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
		*/
		
		/**
		 * Tutorial #5 Expressions
		 */
		
		/*
		double friends =10;
		friends++;
		friends=(double)friends/3;
		System.out.println(friends);
		*/
		
		/**
		 * Tutorial #6 GUI Intro
		 */
		
		/*
		String name= JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your height is "+height+" m tall.");
		*/
		
		/**
		 * Tutorial #7 Math class
		 */
		
		//double x = 3.14;
		//double y = -10;
		
		//double z= Math.max(x, y); //largest number  of two
		//double z= Math.min(x, y); //smallest number  of two
		//double z= Math.abs(y); //absolute value
		//double z= Math.sqrt(x); //square root 
		//double z= Math.round(y); //round
		//double z= Math.ceil(x); //round up
		//double z= Math.floor(x); //round down
		
		//System.out.println(z);
		
		//Finding a hypotenuse 
		
		/*
		double x;
		double y;
		double z;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter side x:");
		x=scanner.nextDouble();
		
		System.out.println("Enter side y:");
		y=scanner.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypothenuse is "+z);
		*/
		
		/**
		 * Tutorial #8 Random Classes
		 */
		
		/*
		Random random = new Random();
		//int x = random.nextInt(6)+1;
		//double y = random.nextDouble();
		boolean z = random.nextBoolean();
		System.out.println(z);
		*/
		
		/**
		 * Tutorial # 9:  if statements
		 */
		
		/*
		int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		if(age >= 75) {
			JOptionPane.showMessageDialog(null, "Ok boomer");
			//System.out.println("Ok boomer");
		}
		else if (age>=18) {
			JOptionPane.showMessageDialog(null, "you are an adult!");
			//System.out.println("you are an adult!");
		}
		else if (age>=13) {
			JOptionPane.showMessageDialog(null, "you are a teenager!");
			//System.out.println("you are a teenager!");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are not an adult!!");
			//System.out.println("you are not an adult!!");
		}
		*/
		
		/**
		 * Tutorial # 10: switches
		 */
		
		/*
		Scanner scanner= new Scanner(System.in);
		String day= scanner.nextLine();
		
		switch (day) {
		case "Sunday":
			System.out.println("It is sunday");
			break;
		case "Monday":
			System.out.println("It is monday");
			break;
		case "Tuesday":
			System.out.println("It is tuesday");
			break;
		case "Wednesday":
			System.out.println("It is wednesday");
			break;
		case "Thursday":
			System.out.println("It is thursday");
			break;
		case "Friday":
			System.out.println("It is Friday");
			break;
		case "Saturday":
			System.out.println("It is Saturday");
			break;
		default: System.out.println(day+" is not a day.");
		}
		*/
		
		/**
		 * Tutorial # 11: Logical operators
		 */
		
		/**
		 * And operator (&&)
		 */
		/*
		int temp =15;
		if(temp >30) {
			System.out.println("It is hot outside");
		}
		else if(temp >=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
		*/
		
		/**
		 * Or operator (||)
		 */
		/*
		Scanner scanner= new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit.");
		String answer=scanner.next();
		
		if (answer.equals("q") ||answer.equals("Q") ) {
			System.out.println("You quit the game.");
		}
		else {
			System.out.println("You want to play *pew pew*.");
		}
		*/
		/**
		 * != operator.
		 */
		
		/*
		Scanner scanner= new Scanner(System.in);
		String answer=null;
		while (true) {
			System.out.println("You are playing a game! Press q or Q to quit.");
			answer=scanner.next();
			if (!answer.equals("q") && !answer.equals("Q") ) {
				System.out.println("You want to play *pew pew*.");
			}
			else {
				System.out.println("You quit the game.");
				break;
			}
		}
		*/
		/**
		 * Tutorial #12: While Loop. Infinitely.
		 */
		/* 
		Scanner scanner = new Scanner(System.in);
		 String name="";
		*/
		/**
		 * do while:
		 */
		/*
		do{
		 System.out.println("Enter your name.");
		 name = scanner.nextLine();
		}while(name.isEmpty());
		 */
		
		/*
		 * while(name.isEmpty()) {
		 
			 System.out.println("Enter your name.");
			 name = scanner.nextLine();
		 }
		 System.out.println("Hello "+name);
		 */
		 /**
		  * Tutorial #13: For Loop. Limited amount of times
		  */
		/*
		  for(int index=10; index>=0; index-=2) {
			  System.out.println(index);
		  }
		  System.out.println("Happy new year");
		  */
		/** 
		 * Tutorial #14: Nested loops
		 */
		/*
		Scanner scanner= new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter the number of rows: ");
		rows=scanner.nextInt();
		System.out.println("Enter the number of columns: ");
		columns=scanner.nextInt();
		System.out.println("Enter symbol you use");
		symbol= scanner.next();
		
		for(int i =1; i<=rows; i++) {
			System.out.println();
			for(int j =1; j<=columns; j++) {
				System.out.print(symbol+" ");
			}
		}
		*/
		/**
		 * Tutorial #15 Arrays
		 */
		/*
		String[]  cars = {"Camaro", "corvette", "tesla", "BMW"};
		cars[0]= "Mustang";
		*/
		/*
		String []cars= new String[3];
		
		cars[0]="Camaro";
		cars[1]="Corvette";
		cars[2]="Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		*/
		/**
		 * Tutorial #16 2D Arrays
		 */
		
		/*String [][]cars= new String[3][3];
		
		cars[0][0]="Camaro";
		cars[0][1]="Corvette";
		cars[0][2]="Silverado";
		cars[1][0]="Mustang";
		cars[1][1]="Ranger";
		cars[1][2]="F-150";
		cars[2][0]="Ferrari";
		cars[2][1]="Lamborgini";
		cars[2][2]="Tesla";
		*/
		/*
		String [][]cars= {	
							{"Camaro", "Corvette", "Silverado"},
							{"Mustang", "Ranger", "F-150"}, 
							{"Ferrari","Lamborgini","Tesla"}
						  };
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		*/
		/**
		 * Tutorial #17 String methods
		 */
		
		String name= "Cindy";
		
		//boolean result=name.equalsIgnoreCase("Cindy");
		//int result= name.length();
		//char result=name.charAt(4);
		//int result=name.indexOf('C');
		//boolean result=name.isEmpty();
		//String result=name.toUpperCase();
		//String result=name.toLowerCase();
		//String result=name.trim();
		String result=name.replace('i', 'a');
		System.out.println(result);
		
	}

}