package com.mendes;

public class Main {

    public static void main(String[] args) {

        GeometricalFigure square = new Square(5);
        square.fieldCalculation();
        square.environmentalCalculation();
        ((Square) square).sayName();
        System.out.println();

        GeometricalFigure rectangle = new Rectangle(5, 8);
        rectangle.fieldCalculation();
        rectangle.environmentalCalculation();
        ((Rectangle) rectangle).sayName();
        System.out.println();


        GeometricalFigure circle = new Circle(9);
        circle.fieldCalculation();
        circle.environmentalCalculation();
        ((Circle) circle).sayName();
        System.out.println();


        fieldComparison(square, rectangle);
        fieldComparison(circle, rectangle);
    }

    public static void fieldComparison(GeometricalFigure g1, GeometricalFigure g2) {
        if (g1.getFieldCalculate() < g2.getFieldCalculate()) {
            System.out.println("Birinci parametrenin alani ikinciden kucuktur.");
        } else if (g1.getFieldCalculate() > g2.getFieldCalculate()) {
            System.out.println("Birinci parametrenin alani ikinciden buyuktur.");
        } else {
            System.out.println("Birinci parametrenin alani ikinciden esittir.");
        }
    }
}
