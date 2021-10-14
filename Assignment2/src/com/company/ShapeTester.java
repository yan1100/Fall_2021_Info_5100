package com.company;

import java.awt.*;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());

        Shape shape2 = new Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
        System.out.println(shape2.printShape());

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple",4, 7);
        System.out.println("rectangle2");System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());Square square1 = new Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());

        Square square2 = new Square("Square" , "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
        System.out.println(square2.printShape());
    }

    public static class Shape {
        private String name;
        private String color;
        private int area;
        private int perimeter;

        public Shape(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public Shape(String name, String color, int perimeter, int area) {
            this.name = name;
            this.color = color;
            this.area = area;
            this.perimeter = perimeter;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getArea() {
            return area;
        }

        public void setArea(int area) {
            this.area = area;
        }

        public int getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(int perimeter) {
            this.perimeter = perimeter;
        }

        public String printShape() {
            return "The " + name + " has a " + color + " color";
        }
    }

    public static class Rectangle extends Shape {
        private int width;
        private int height;

        public Rectangle(int side) {
            this(side, side);
        }

        public Rectangle(int width, int height) {
            this(null,null, width, height);
        }

        public Rectangle(String name, String color, int width, int height) {
            super(name, color);
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }

        @Override
        public int getPerimeter() {
            return (width + height) * 2;
        }
    }


    public static class Square extends Shape {
        private int side;

        public Square(int side) {
            this(null,null,side);
        }

        public Square(String name, String color, int side) {
            super(name, color);
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int getArea() {
            return side * side;
        }

        @Override
        public int getPerimeter() {
            return side * 4;
        }
    }
}
