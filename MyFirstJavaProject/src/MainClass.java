import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.ArrayList;
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
		/*
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
		*/
		/**
		 *  Tutorial #18 wrapper classes
		 */
		/*
		Boolean a = true;
		Character b= '&';
		Integer c= 123;
		Double d= 3.14;
		String e ="Cindy";
		
		if(a==true) {
			System.out.println("This is "+a );
		}*/
		/**
		 *  Tutorial #19 ArrayLists
		 */
		/*
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Bimbab");
		food.add("Ramen");
		food.add("Kimchi");
		
		food.set(0, "Spaguetti");
		food.remove(1);
		//food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		*/
		/**
		 *  Tutorial #20 ArrayLists 2D
		 */
		/*
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList= new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		ArrayList<String> produceList= new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList= new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(2).get(1));
		*/
		
		/**
		 * Tutorial #21 For each loop
		 */
		//String[] animals = {"cat", "dog", "rat", "bird", "bear", "bee"};
		
		/*
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		animals.add("bee");
		
		for(String i : animals) {
			System.out.println(i);
		}
		*/
		/**
		 * Tutorial #22 Methods
		 */
		/*
		int age=23;
		hello("Cindy", age);
		
		int x =3;
		int y=4;
		int z=add(x,y);
		System.out.println(z);
		*/
		
		/**
		 *  Tutorial #23 Overloaded methods
		 */
		/*
		int x = add(1,2,5,77);
		double y = add(1.44,2.5,5.22,77.12);
		System.out.println(x+" "+y);
		*/
		
		/**
		 * Tutorial #24 printf
		 */
		/*
		//System.out.printf("%d This is a format string", 123);
		
		boolean myBoolean = true;
		char myChar = '!';
		String myString = "Cindy";
		int myInt = 22;
		double myDouble=1000;
		//[conversion - caracter]
		
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%c", myChar);
		//System.out.printf("%s", myString);
		//System.out.printf("%d", myInt);
		//System.out.printf("%f", myDouble);
		
		//[width]
		
		//minimum number of characters to be written as output
		System.out.printf("Hello %-10s",myString);
		System.out.println();
		
		//precision
		System.out.printf("You have this much money %.2f", myDouble);
		System.out.println();
		
		//flags
		System.out.printf("You have this much money %,f", myDouble);
		*/
		/**
		 * Tutorial #25 Final keyword
		 */
		/*
		double PI=3.14159; //this value cannot be changed later.
		//PI = 3.2 //Produces an error.
		System.out.println(PI);
		*/
		/**
		 * Turorial #26 OOP
		 */
		/*
		Car myCar = new Car();
		System.out.println(myCar.model);
		System.out.println(myCar.make);
		myCar.drive();
		myCar.breaks();
		*/
		/**
		 * Turorial #27 Constructors
		 */
		/*
		Human human1 = new Human("Cindy", 42, 76.9);
		Human human2 = new Human("Maria", 33,46.8);
		
		System.out.println(human2.name);
		
		human1.eat();
		human2.drink();
		*/
		/**
		 * Tutorial #28 variable scope
		 */
		//DiceRoller diceRoller= new DiceRoller();
		/**
		 * Tutorial #29 overloaded constructors 
		 */
		
		Pizza pizza= new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
		Pizza pizza1= new Pizza("thick crust", "tomato", "mozzarella");
		Pizza pizza2= new Pizza("thick crust", "tomato");
		Pizza pizza3= new Pizza("thick crust");
		System.out.println("These are the ingredients of your pizzas");
		
		System.out.println(pizza.bread+" "+pizza.cheese+" "+pizza.sauce+" "+pizza.topping);
		System.out.println(pizza1.bread+" "+pizza1.cheese+" "+pizza1.sauce+" "+pizza1.topping);
		System.out.println(pizza2.bread+" "+pizza2.cheese+" "+pizza2.sauce+" "+pizza2.topping);
		System.out.println(pizza3.bread+" "+pizza3.cheese+" "+pizza3.sauce+" "+pizza3.topping);
		
	}
	
	static int add(int x, int y) {
		System.out.println("overloaded method 1");
		int result=0;
		result=x+y;
		return result;
	}
	
	static int add(int x, int y, int z) {
		System.out.println("overloaded method 2");
		return x + y + z;
	}
	
	static int add(int x, int y, int z, int a) {
		System.out.println("overloaded method 3");
		return x + y + z + a;
	}
	
	static double add(double x, double y) {
		System.out.println("overloaded method 1");
		double result=0;
		result=x+y;
		return result;
	}
	
	static double add(double x, double y, double z) {
		System.out.println("overloaded method 2");
		return x + y + z;
	}
	
	static double add(double x, double y, double z, double a) {
		System.out.println("overloaded method 3");
		return x + y + z + a;
	}
	
	
}