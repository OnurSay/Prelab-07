import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int a;
		System.out.println("Enter the number of operands (in range 2-10):");
		a = keyboard.nextInt();
		while(a<2 || a>10){
			System.out.println("Enter the number of operands (in range 2-10):");
		  a=keyboard.nextInt();
		}
		
		
		
		
		int b = 1;
		int multp=1;
		int numberx = 0;
		String c =" ";
		for(b = 1; b <= a; b++){
			
			System.out.println("Enter number "+b+":" );
			int number = keyboard.nextInt();
			multp = multp*number;
			c = c + number + " ";
			
			
			
			
		
		}System.out.print("Multiplication of numbers " + "\"" + c+ "\"" +  " is: " +multp  );
			
		
	
	
	}
		
		
			
		
		
		
	}


