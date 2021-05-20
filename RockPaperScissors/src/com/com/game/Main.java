package com.game;
import com.game.bo.UserInputBO;
import com.game.controller.GameController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Rock Paper Scissors!");

        GameController gc=new GameController();
        String status=gc.RSPgame();
        System.out.println(status);


    }
}
