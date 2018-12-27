package ru.kogut.enterprise.common;

import ru.kogut.enterprise.enums.Answers;

public class Answer {

    public ru.kogut.enterprise.enums.Answers answer;
    public String discription;

    public Answer() {
    }

    public Answer(Answers answer) {
        this.answer = answer;
    }

    public Answer(Answers answer, String discription) {
        this.answer = answer;
        this.discription = discription;
    }
}
