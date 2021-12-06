package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
    protected ArrayList<String> questions = new ArrayList<>();

    public Questions() {

    }

    public Questions(ArrayList<String> startQuestions) {
        questions = startQuestions;
    }

    public ArrayList<String> getQuestions() {

        return questions;
    }

    public void setQuestions(String question) {

        questions.add(question);
    }
}
