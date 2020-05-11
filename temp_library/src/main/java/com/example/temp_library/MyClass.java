package com.example.temp_library;

public class MyClass {
    private double tempEntry;

    public MyClass(String t) { this.tempEntry = Double.parseDouble(t); }

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
        MyClass myModel = new MyClass("76");
//        System.out.println("This is code");
        System.out.println(myModel.celsius());
    }
}
