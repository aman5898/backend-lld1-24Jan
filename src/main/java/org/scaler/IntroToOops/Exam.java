package org.scaler.IntroToOops;

public class Exam {
    int exam_id;
    int exam_score;

    public Exam(int id, int score){
        exam_id = id;
        exam_score = score;
    }

    public Exam(Exam o){
        this.exam_id = o.exam_id;
        this.exam_score = o.exam_score;
    }
}
