package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game implements Process {
    Scanner sc = new Scanner(System.in);
    ScoreCounter gameScore = new ScoreCounter();
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    private String startText = "Хочешь поиграть(да/нет)?";
    private String comebackText = "Приходи в другой раз!";
    private String pointcountText = "Количество очков: ";
    private String rightAnswer = "Верно!";
    private String wrongAnswer = "Неверно!";
    private String endText = "Спасибо за игру!";

    public Game(Questions quests, Answers answs) {
        this.questions = quests.getQuestions();
        this.answers = answs.getAnswers();
    }

    public void startGame() {
            System.out.println(startText);
            String decision = sc.nextLine();
            if (Proceed(decision)) {
                for (int i = 0; i < questions.size(); i++) {
                    System.out.println("Вопрос №" + Integer.toString(i + 1));
                    System.out.println(questions.get(i));
                    String answer = sc.nextLine();
                    if (Checker(answer, answers.get(i))) {
                        gameScore.setScore();
                        System.out.println(rightAnswer);
                        System.out.println("-------------------");
                        System.out.println("Ваш счет: " + gameScore.getScore() + " из " + Integer.toString(i + 1));
                        System.out.println("-------------------");
                    }
                    else {
                        System.out.println(wrongAnswer);
                        System.out.println("-------------------");
                        System.out.println("Ваш счет: " + gameScore.getScore() + " из " + Integer.toString(i + 1));
                        System.out.println("-------------------");
                    }
                }
                System.out.println(endText);
            } else
                System.out.println(comebackText);
        }

    @Override
    public boolean Proceed(String dis) {
        if (dis.equals("Да") | dis.equals("да")) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean Checker(String state1, String state2) {
        if (state1.equals(state2)) {
            return true;
        }
        else
            return false;
    }
}
