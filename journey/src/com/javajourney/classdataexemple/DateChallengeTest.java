package com.javajourney.classdataexemple;



public class DateChallengeTest {

  public static void main(String[] args) {
    DateChallenge firstDate = new DateChallenge();

    firstDate.day = 12;
    firstDate.mouth = "march";
    firstDate.year = 2004;

    DateChallenge secondDate = new DateChallenge();
    secondDate.day = 20;
    secondDate.mouth = "june";
    secondDate.year = 2013;


    System.out.printf("%d/%s/%d\n", firstDate.day, firstDate.mouth, firstDate.year);
    System.out.printf("%d/%s/%d", secondDate.day, secondDate.mouth, secondDate.year);
  }
}
