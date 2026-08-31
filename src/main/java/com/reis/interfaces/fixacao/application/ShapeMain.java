package com.reis.interfaces.fixacao.application;

import com.reis.interfaces.fixacao.entities.AbstractShape;
import com.reis.interfaces.fixacao.entities.Color;
import com.reis.interfaces.fixacao.entities.Rectangle;
import com.reis.interfaces.fixacao.entities.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        AbstractShape ab1 = new Rectangle(Color.BLACK, 10.0, 12.0);
        System.out.println(ab1.area());
    }
}
