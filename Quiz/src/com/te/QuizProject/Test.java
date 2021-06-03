package com.te.QuizProject;

import java.util.Scanner;

public class Test {

	public static void takeTest(Question [] questions) {
		int score = 0;
		double percentage = 0;
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<questions.length; i++) {
			System.out.print(questions[i].prompt);
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase(questions[i].answer))
				score++;
		}
		percentage  = (double)(score*100)/questions.length;
		
		System.out.println("You got "+score+ " / "+questions.length+" correct");
		System.out.println("Your percentage : "+percentage);
		
		remarks(percentage);
		
	}
	
	public static void remarks(double percentage) {
		String remarks;
		
		if(percentage >= 100)
			remarks = "Excellent";
		else if(percentage >= 80)
			remarks = "Very Good";
		else if(percentage >= 60)
			remarks = "Good";
		else if(percentage >= 40)
			remarks = "Poor";
		else if(percentage >= 20)
			remarks = "Bad";
		else 
			remarks = "Please revise properly...";
		
		System.out.println(remarks);
		
	}
}
