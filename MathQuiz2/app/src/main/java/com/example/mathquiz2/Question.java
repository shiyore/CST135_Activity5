package com.example.mathquiz2;

import java.util.Random;

public class Question {
    private int firstNumber;
    private int secondNumber;
    private int answer;
    //list of possible answers
    private int[] answerArray;
    //where the number will be displayed
    private int answerPosition;
    //maximum values for the nubers
    private int upperLimit;

    //generate a new random question
    public Question(int upperLimit){
        this.upperLimit = upperLimit;
        Random RNG =  new Random();

        this.firstNumber =  RNG.nextInt(upperLimit);
        this.secondNumber = RNG.nextInt(upperLimit);
        this.answer = this.firstNumber + this.secondNumber;

        this.answerPosition = RNG.nextInt(4);
        this.answerArray = new int[] {0,1,2,3};

        this.answerArray[0] = answer + 1;
        this.answerArray[0] = answer + 10;
        this.answerArray[0] = answer - 5;
        this.answerArray[0] = answer - 2;

        this.answerArray = shuffleArray(this.answerArray);
        this.answerArray[answerPosition] = answer;
        this.questionPhrase = firstNumber + " + " + secondNumber + " = ";
    }

    private int[] shuffleArray(int[] array){
        int index , temp;
        Random RNG = new Random();
        for (int i = array.length - 1 ; i > 0; i--){
            index = RNG.nextInt(i+1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int[] getAnswerArray() {
        return answerArray;
    }

    public void setAnswerArray(int[] answerArray) {
        this.answerArray = answerArray;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionPhrase() {
        return questionPhrase;
    }

    public void setQuestionPhrase(String questionPhrase) {
        this.questionPhrase = questionPhrase;
    }

    //string output of the problem
    private String questionPhrase;
}
