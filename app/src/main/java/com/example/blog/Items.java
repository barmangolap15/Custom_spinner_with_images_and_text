package com.example.blog;

public class Items {
    private String spinnerText;
    private int spinnerImage;

    //constructor
    public Items(String spinnerText, int spinnerImage) {
        this.spinnerText = spinnerText;
        this.spinnerImage = spinnerImage;
    }

    //getter
    public String getSpinnerText() {
        return spinnerText;
    }

    public int getSpinnerImage() {
        return spinnerImage;
    }
}

