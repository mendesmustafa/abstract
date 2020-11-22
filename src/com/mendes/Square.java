package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Square extends GeometricalFigure {

    public Square(int edge) {
        this.setFirstEdge(edge);
    }

    @Override
    public void fieldCalculation() {
        setFieldCalculate(getFirstEdge() * getFirstEdge());
        System.out.println("Karenin alanı: " + getFieldCalculate());
    }

    @Override
    public void environmentalCalculation() {
        System.out.println("Karenin cevresi: " + getFirstEdge() * 4);
    }

    public void sayName() {
        System.out.println("Ben bir kare nesnesiyim.");
    }
}
