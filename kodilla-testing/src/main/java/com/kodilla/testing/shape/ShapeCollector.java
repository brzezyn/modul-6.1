package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
        public int figuresCounter = 1;

        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        public ShapeCollector(ArrayList<Shape> shapeList) {
                this.shapeList = shapeList;
        }
        public void addFigure(Shape shape) {
                shapeList.add(shape);
        }
        public boolean removeFigure(Shape shape) {
                boolean result = false;
                if (shapeList.contains(shape)) {
                    shapeList.remove(shape);
                    result = true;
                }
                return result;
        }
        public Shape getFigure(int n) {
                Shape shape = null;
                if (n >= 0 && n < shapeList.size()) {
                        shape = shapeList.get(n);
                }
                return shape;
        }
        public int showFigure() {
                for (Shape showFigure : shapeList) {
                        System.out.println("Figure: " + showFigure.getShapeName() + " Field: " +
                                showFigure.getField() + "m^2.");
                }
                return figuresCounter;
        }
}