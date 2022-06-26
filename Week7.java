/**
 * 
 */
package week7;
import java.util.Random;
import java.util.Scanner;

/**
 * @author venkata srilekha C0840491
 *
 */
public class Week7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Flow
		//Ask for user password
		//Validate the password
		
		//Vars
		String correctPassword = "bob";
		String userPassword;
		String userAnswer = null;
		boolean passwordflag = false;
		boolean answerflag = false;
		int randNumber; 
		//boolean correctAnswer;
		
		String[] question = {"What season are we in",
				"What is the color of the sky","What is a tesla",
				"What is todays day"};
		String[] answers = {"summer",
				"blue","car","friday"};
		//Random number
				Random rand = new Random();
				randNumber = rand.nextInt(4);
		
		//User input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your password");
		userPassword = keyboard.nextLine();
		
		//Validate user password
		if (userPassword.equals(correctPassword))
		{
			passwordflag = true;
		}
		
		//Ask a random question
		System.out.println("Please enter the question:");

		//Print the question
		if(randNumber == 0)
		{
			System.out.println(question[randNumber]);
			//User answers input
			userAnswer = keyboard.nextLine();
			
		}
		else if(randNumber ==1)
		{
			System.out.println(question[1]);
			System.out.println(question[randNumber]);
			//User answers input
			userAnswer = keyboard.nextLine();
		}
		else if(randNumber ==2)
		{
			System.out.println(question[2]);
			System.out.println(question[randNumber]);
			//User answers input
			userAnswer = keyboard.nextLine();
		}
		else if(randNumber ==3)
		{
			System.out.println(question[3]);
			System.out.println(question[randNumber]);
			//User answers input
			userAnswer = keyboard.nextLine();
		}
		
		//Validate answer
		if(userAnswer.equals(answers[randNumber]))
		{
			answerflag = true;
		}
		
		//Output access granted if true or print something else 
		if(passwordflag&&answerflag)//true true
		{
			System.out.println("Access granted");
		}
		else if (passwordflag&&answerflag)//true false or false true
		{
			System.out.println("Something went wrong");
		}
		else// false false 
		{
			System.out.println("Incorrect info, try again later");
		}
	}

}