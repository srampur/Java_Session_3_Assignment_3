import java.util.Random;
import java.util.Scanner;

/*
 * Session 3 : OOPs class & objects
Assignment 
–
Write a java program which generates a random number 
such  that  0  <=  Random  Number  <=  N-1
*  where  N  is  a  given  input number.
 */
public class RandomNumber {
	
	private final void generateRandomNumber (int num)
	{
		Random r = new Random();
		
		int rn = r.nextInt(num)+0;
		System.out.println(rn);
	}

	public static void main(String[] args) {
		RandomNumber robj = new RandomNumber();
		Scanner s = new Scanner(System.in);
		robj.generateRandomNumber(s.nextInt());
		s.close();
	}

}
