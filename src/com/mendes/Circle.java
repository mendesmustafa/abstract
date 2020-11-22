package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Circle extends GeometricalFigure {

    public Circle(int radius) {
        setFirstEdge(radius);
    }

    @Override
    public void fieldCalculation() {
        setFieldCalculate((int) (2 * Math.PI * getFirstEdge()));
        System.out.println("Daireniin alanı: " + getFieldCalculate());
    }

    @Override
    public void environmentalCalculation() {
        System.out.println("Dairenin cevresi: " + Math.PI * getFirstEdge() * getFirstEdge());
    }

    public void sayName() {
        System.out.println("Ben bir daire nesnesiyim.");
    }
}
