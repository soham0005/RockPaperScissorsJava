package com.game.controller;

import com.game.bo.UserInputBO;
import com.game.bo.UserResponseBO;
import com.game.logic.GameLogic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GameController {

    HashMap<Integer, String> CreateHashMapGame(){
        HashMap<Integer,String> formalHashMap=new HashMap<Integer,String>();
       formalHashMap.put(0,"Rock");
        formalHashMap.put(1,"Paper");
        formalHashMap.put(2,"Scissor");
        return formalHashMap;
    }

    UserResponseBO userResponseBO = new UserResponseBO();

    Scanner input=new Scanner(System.in);
    GameLogic gLogic =new GameLogic();

    public String RSPgame(){

        UserInputBO userBO=new UserInputBO();
        String result="";

        HashMap<Integer,String> actualHashMap =new HashMap<Integer,String>();
        actualHashMap=CreateHashMapGame();
        System.out.println(actualHashMap);//testing hashmap

        System.out.println("Enter the Name:");
        userBO.setName(input.next());
        System.out.println("Please select the number of rounds you would like to play:");
        userBO.setNumberOfRounds(input.nextInt());
        //User result and computer result is set 0
        userResponseBO.setUserScore(0);
        userResponseBO.setComputerScore(0);
        //System.out.println(userBO.toString());

         //while started
       // while(userBO.getNumberOfRounds()>0) {
        Integer n=userBO.getNumberOfRounds();
        while(n>0){
            System.out.println("--------------------------");
            System.out.println("Enter your choice");
            System.out.println("0->Rock\n1->Paper\n2->Scissors");
            Integer userValue=input.nextInt();
            Set<Integer> keySet = actualHashMap.keySet();

            //Input validations

            if(!keySet.contains(userValue)){
                System.out.println("Invalid choice,Please try again ");
                n--;
                continue;
            }

            userBO.setChoice(userValue);           //userValue is user's choice

            Boolean roundResult = gLogic.compareChoices(userBO,actualHashMap);

            if (roundResult != null && roundResult) {
                userResponseBO.setResult(true);
                userResponseBO.setUserScore(userResponseBO.getUserScore() + 1);
                System.out.println(userBO.getName()+" Won");
            } else if (roundResult != null) {
                userResponseBO.setResult(false);
                userResponseBO.setComputerScore(userResponseBO.getComputerScore() + 1);
                System.out.println("Computer Won");
            }
            System.out.println(userBO.getName()+" score: "+userResponseBO.getUserScore());
            System.out.println("Computer score: "+userResponseBO.getComputerScore());

            n--;
        }
             if (userResponseBO.getUserScore() > userResponseBO.getComputerScore()) {
                //set result as Won
                 result="Congratulations " + userBO.getName() + " You Won.";
            } else if (userResponseBO.getUserScore() < userResponseBO.getComputerScore()) {
                //set result as Lost
                 result="I'm afraid, "+userBO.getName()+" LOST.";
            } else if (userResponseBO.getUserScore().equals(userResponseBO.getComputerScore())) {
                //set result as Tie
                 result="Oops" + userBO.getName() + " It's a Tie,Please Try again.";
            }
        return result;

    }


}
