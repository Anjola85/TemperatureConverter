package com.example.temperature;

public class TempModel {
    private double tempEntry;

    public TempModel(String t) { this.tempEntry = Double.parseDouble(t); }

    public String celsius() {
        double t = this.tempEntry;
        double index = 5*((t-32)/9);
        String result = String.format("%.1f", index);
        return result;
    }

    public String fahrenheit() {
        double t = this.tempEntry;
        double index = (32+(9*t))/5;
        String result = String.format("%.1f", index);
        return result;
    }

    public static void main(String[] args) {
//        TempModel myModel = new TempModel("76");
        System.out.println("This is code");
//        System.out.println(myModel.celsius());
    }
}
