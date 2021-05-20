package com.game.bo;

import java.io.Serializable;

public class UserInputBO implements Serializable {
    private String  name;
    private Integer choice;
    private Integer numberOfRounds;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(Integer numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }




    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }

    public UserInputBO(String name, Integer choice, Integer numberOfRounds) {
        this.name = name;
        this.choice = choice;
        this.numberOfRounds = numberOfRounds;
    }

    public UserInputBO() {

    }


    @Override
    public String toString() {
        return "UserInputBO{" +
                "name='" + name + '\'' +
                ", choice=" + choice +
                ", numberOfRounds=" + numberOfRounds +
                '}';
    }
}
