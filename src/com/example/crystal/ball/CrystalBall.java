package com.example.crystal.ball;

import java.util.Random;

public class CrystalBall {
	public String [] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"Without a doubt",
			"You may rely on it",
			"As I see it yes",
			"Most likely",
			"Outlook good",
			"Yes",
			"Reply hazy. Try again",
			"Ask again later",
			"Better not tell you now",
			"Cannot predict now",
			"Concentrate and ask again",
			"Don't count on it",
			"My reply is no",
			"My sources say no",
			"Outlook not so good",
			"Very doubtful",
			"lol no"
		};
	
	public String getAnAnswer() {

			//The button was clicked, so update answer label with answer
			String answer = "";
			//Randomly select one of three answers: Yes, No, or Maybe
			Random randomGenerator = new Random(); //Construct a new random number generator 
			int randomNumber = randomGenerator.nextInt(mAnswers.length);
			
			answer = mAnswers[randomNumber];
			
			return answer;
	}
}
