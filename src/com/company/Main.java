package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("newScore is " + newScore);
        calculateScore(75);

    }

    public static int calculateScore(String playername, int score) {
        System.out.println("Player " + playername + " scored "  + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player " + " scored "  + score + " points");
        return score * 1000;
    }
}
