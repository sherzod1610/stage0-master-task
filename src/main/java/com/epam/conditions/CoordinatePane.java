package com.epam.conditions;

public class CoordinatePane {
    public void printQuadrant (int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("First");
        } else if (x < 0 && y > 0) {
            System.out.println("Second");
        } else if (x < 0 && y < 0) {
            System.out.println("Third");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth");
        } else {
            System.out.println("0");
        }
    }
}

