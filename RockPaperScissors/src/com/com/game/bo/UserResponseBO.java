package com.game.bo;

import java.io.Serializable;

public class UserResponseBO implements Serializable {


    private Boolean result;
    private Integer userScore;
    private Integer computerScore;
    private Integer finalResult;


    public Integer getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(Integer finalResult) {
        this.finalResult = finalResult;
    }

    public Integer getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(Integer computerScore) {
        this.computerScore = computerScore;
    }






    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public UserResponseBO(Boolean result, Integer UserScore, Integer computerScore,Integer finalResult) {
        this.result = result;
        this.userScore = UserScore;
        this.computerScore=computerScore;
        this.finalResult=finalResult;
    }


    @Override
    public String toString() {
        return "UserResponseBO{" +
                "result=" + result +
                ", userScore=" + userScore +
                ", computerScore=" + computerScore +
                ", finalResult=" + finalResult +
                '}';
    }

    public UserResponseBO() {
    }
}
