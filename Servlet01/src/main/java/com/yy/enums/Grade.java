package com.yy.enums;



public enum Grade {
    One("一年级",1),
    Two("二年级",2),
    Three("三年级",3);

    public String grade;
    public int label;
    Grade(String grade, int label) {
        this.grade=grade;
        this.label=label;
    }

    public static void main(String[] args) {
        Grade g=Grade.One;

    }


}
