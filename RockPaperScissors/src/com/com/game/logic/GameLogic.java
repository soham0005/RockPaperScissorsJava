package com.game.logic;

import com.game.bo.UserInputBO;
import com.game.bo.UserResponseBO;
import com.game.dao.GameDAO;

import java.util.HashMap;

public class GameLogic {



    public Boolean compareChoices(UserInputBO userBO, HashMap<Integer, String> actualHashMap) {

        //Step 1:- Get User  Input value
        // System.out.println(userBO.toString());

        //Step 2:- Get Computer Generated value
        //while
        GameDAO gameDAO = new GameDAO();

            Integer computerChoice = gameDAO.generateRandomNumber();
//        System.out.println(computerChoice);

            //Step 3: Compare Them
            Boolean calResult = gameDAO.generateResult(userBO.getChoice(), computerChoice,actualHashMap);


//            //Step 5: Return Result


        return calResult;
    }
}
