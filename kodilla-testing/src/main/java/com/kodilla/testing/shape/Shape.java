package com.kodilla.testing.shape;

public interface Shape {
    String getShapeName();

    double getField();
}

class Circle implements Shape {
    @Override
    public double getField() {
        return 3.14;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}

class Square implements Shape {
    @Override
    public double getField() {
        return 4;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}

class Triangle implements Shape {
    @Override
    public double getField() {
        return 1;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}

