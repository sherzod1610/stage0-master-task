package com.epam.conditions;

public class CoordinatePane {
    public void printQuadrant (int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("First quadrant ");
        } else if (x < 0 && y > 0) {
            System.out.println("Second quadrant ");
        } else if (x < 0 && y < 0) {
            System.out.println("Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth quadrant");
        } else {
            System.out.println("The point is at the origin (0,0)");
        }
    }
}

