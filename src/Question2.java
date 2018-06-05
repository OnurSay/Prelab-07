import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		String A;
		int b1,b2,b3;
		int a=0,b=0,c=0;
		String C=" ";
		int p1,p2,p3;
		
		System.out.println("Enter the number of employees:");
		number = keyboard.nextInt();
		
		for(int number1=1; number1<=number; number1++){
			
			System.out.println("Enter your name and surname:");
			String name=keyboard.next();
			String surname=keyboard.next();
			System.out.println("Enter your special number:");
			A = keyboard.next();
			b1 = name.length();
			b2 = surname.length();
			String r1 = name.substring(0, b1/2);
			String r2 = surname.substring(0, b2/2);
			b3 = A.length();
			if (b3>6)
			{
				System.out.println("Enter your special number:");
				A = keyboard.next();
				b3 = A.length();
			}
			else;
			
			int c1 = Character.getNumericValue(A.charAt(b3-1));
			int c2 = c1*c1;
			String password = r1+r2+A+c2;
			System.out.println("The generated password for " + name + " " + surname + " is: " + password);
			C = C +password + " ";
			
			int passLength = password.length();
			if (passLength<7){
				System.out.println("Weak password");
				a++;
			}else if ((passLength >= 7) && (passLength <= 12)){
				System.out.println("Medium password");
				b++;
				
			}else if (passLength > 12){
				System.out.println("Strong password");
				c++;
			}
			
		}
		String max = "none";
		String min = "none";
		String[] splitted = C.split("\\s+");
		
		if (number == 1)
		{
			String zero = splitted[0];
			String one = splitted[1];
			max = min = one;
		}else if (number == 2){
			String zero = splitted[0];
			String one = splitted[1];
			String two = splitted[2];
			p1 = one.length();
			p2 = two.length();
			if (p1>p2){
				max = one;
				min = two;
			}else 
				max = two;
				min = one;
		}else if (number == 3){
			String zero = splitted [0];
			String one = splitted [1];
			String two = splitted [2];
			String three = splitted [3];
			p1 = one.length();
			p2 = two.length();
			p3 = three.length();
			if ((p1>p2) && (p1>p3) && (p2>p3)){
				max = one;
				min = three;
			}else if ((p1>p2) && (p1>p3) && (p2<p3)){
				max = one;
				min = two;
			}else if ((p1<p2) && (p1<p3) && (p2<p3)){
				max = three;
				min = one;
			}else if ((p1>p2) && (p1<p3) && (p2<p3)){
				max = three;
				min = two;
			}else if ((p2>p1) && (p2>p3) && (p1>p3)){
				max = two;
				min = three;
			}else if ((p2>p1) && ( p2>p3) && (p1<p3)){
				max = two;
				min = one;
			}
		}
		
			System.out.println("Password generator info dialog:");
			System.out.println("# of weak passwords: " + a);
			System.out.println("# of medium passwords: " + b);
			System.out.println("# of strong passwords: " + c);
			System.out.println("The weakest password is: " + min);
			System.out.println("The strongest password is: " + max);
	}

}
