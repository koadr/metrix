package com.koadr;


public class SagaState {
    private int number;
    private String word;

    public SagaState(int number, String word) {
        this.number = number;
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "SagaState{" +
                "number=" + number +
                ", word='" + word + '\'' +
                '}';
    }
}
