package ex33;
import CustomUtils.*;

import java.util.Random;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 *
 * A class that messages responses and creation of a virtual Magic 8-ball
 */

public class Magic8Ball {
    String[] responses;

    public Magic8Ball(String[] responses) {
        this.responses = responses;
    }

    public String GetRandomResponse() {
        Random rand = new Random();
        int randIndex = rand.nextInt(responses.length);

        return responses[randIndex];
    }

    //Asks for a question and prints a randomly selected response
    public void AskForQuestion() {
        Input.GetString("What's your question? \n");
        System.out.println(GetRandomResponse());
    }

}
