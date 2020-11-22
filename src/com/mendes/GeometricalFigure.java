package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */
abstract public class GeometricalFigure {

    private int firstEdge;
    private int fieldCalculate;

    abstract public void fieldCalculation();

    abstract public void environmentalCalculation();

    public int getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(int firstEdge) {
        this.firstEdge = firstEdge;
    }

    public int getFieldCalculate() {
        return fieldCalculate;
    }

    public void setFieldCalculate(int fieldCalculate) {
        this.fieldCalculate = fieldCalculate;
    }
}
