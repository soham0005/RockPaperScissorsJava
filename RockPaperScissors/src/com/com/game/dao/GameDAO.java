package com.game.dao;

import java.util.HashMap;
import java.util.Random;

public class GameDAO {
    public Integer generateRandomNumber(){
        Random random=new Random();
         return random.nextInt(3);
    }
    public Boolean generateResult(Integer playerChoice, Integer opponentChoice, HashMap<Integer,String> actualHashMap){
           Boolean res=null;
        //System.out.println("User choice "+playerChoice+"\tComputer choice "+opponentChoice);
        System.out.println("User Choice "+actualHashMap.get(playerChoice));
        System.out.println("Computer Choice "+actualHashMap.get(opponentChoice));
        if(playerChoice.equals(opponentChoice)){
            System.out.println("Tie!");
        }
        else if ((playerChoice.equals(0) && opponentChoice.equals(2)) || (playerChoice.equals(1) && opponentChoice.equals(0)) || (playerChoice.equals(2) && opponentChoice.equals(1))) {
//            System.out.println("User Won");
            res=true;

        }
        else{
//            System.out.println("User Lost");
            res=false;
        }
        return res;




    }                                                     //0--Rock     1--Paper   2--Scissor
}
