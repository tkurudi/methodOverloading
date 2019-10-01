package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("tim", 500);
//        System.out.println("newScore is " + newScore);
//       calculateScore(75);
        calcFeetAndInchesToCent(6, 0);
   }
//
//    public static int calculateScore(String playername, int score) {
//        System.out.println("Player " + playername + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("unnamed player " + " scored " + score + " points");
//        return score * 1000;
  // }



    public static double calcFeetAndInchesToCent(double feet, double inches) {
        if ((feet < 0 && (inches < 0) && (inches > 12))) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet," + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

}