import java.util.Scanner;

public class HelloWorld {

       public static void main(String[] args) {
		  
	// 	  String name = "Varun";
	// 	  String pretext = "My name is";
	// 	  String greet = "Hello World!!";

	//   System.out.println(greet + "," + pretext + " " + name);
	//   //System.out.println("HelloWorld!! Its Me Varun!!");
	//   System.out.println("what do you want to update prext to?");
	// Scanner input = new Scanner(System.in);
	// pretext = input.next();
	// System.out.println(greet + "," + pretext + " " + name);

// Input number fortune example

	// System.out.println("Pick a number between 1 and 10");
	// Scanner scanner = new Scanner(System.in);

	// int inputtedNum = scanner.nextInt();

	// if(inputtedNum < 5){
	// 	System.out.println("Enjoy the goodluck a friend brings you");
	// }

	// else{
	// 	System.out.println("Your Shoe Selection will make you very happy today");
	// }


	//Repeat song example

	// Scanner input = new Scanner(System.in);
	// boolean isOnRepeat = true;

	// while(isOnRepeat){
	// System.out.println("Playing current song");	
	// System.out.println("Would you like to take this song off of repeat? If so, answer yes");	
	// String userinput = input.next();

	// if(userinput.equals("yes")){
	// 	isOnRepeat = false;
	// }
	// }

	// System.out.println("Playing Next Song");


	//This is a test for multiple choice questions
	  String question = "What is the largest planet in our solar system";
	  String choiceOne = "earth";
	  String choiceTwo = "jupiter";
	  String choiceThree = "saturn";

	  String correctanswer = choiceTwo;

	  System.out.print(question);

	  System.out.print("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

	  Scanner scanner = new Scanner(System.in);

	  String input = scanner.next();

	  if(correctanswer.equals(input.toLowerCase())){
		System.out.println("Congrats!! That's the correct answer");  
	  }
	  else{
		System.out.println("You are incorrect!! The correct answer is " + correctanswer);
		///////
	  }
	  }
	  
}