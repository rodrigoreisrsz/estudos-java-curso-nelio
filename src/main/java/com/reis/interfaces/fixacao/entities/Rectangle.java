package com.reis.interfaces.fixacao.entities;

public class Rectangle extends AbstractShape{
    private double width;
    private double weight
            ;

    public Rectangle(Color color, double width, double weight) {
        super(color);
        this.width = width;
        this.weight = weight;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double area() {
        return weight * width;
    }
}
