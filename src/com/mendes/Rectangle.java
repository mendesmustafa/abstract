package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Rectangle extends GeometricalFigure {

    private int secondEdge;

    public Rectangle(int firstEdge, int secondEdge) {
        this.setFirstEdge(firstEdge);
        this.secondEdge = secondEdge;
    }

    public int getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        this.secondEdge = secondEdge;
    }

    @Override
    public void fieldCalculation() {
        setFieldCalculate(getFirstEdge() * secondEdge);
        System.out.println("Dikdorgenin alanı: " + getFieldCalculate());
    }

    @Override
    public void environmentalCalculation() {
        System.out.println("Dikdortgenin cevresi: " + 2 * (getFirstEdge() + secondEdge));
    }

    public void sayName() {
        System.out.println("Ben bir dikdortgen nesnesiyim.");
    }
}
