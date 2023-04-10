package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = hasFur ? "a" : "no";
        String pawWord = numberOfPaws == 1 ? "paw" : "paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + fur + " fur.";
    }
    
    public void optionalTask(){
        Dog myDog = new Dog();
        System.out.println(myDog.getDescription()); // "This animal is mostly brown. It has 4 paws and a fur."

        Bird myBird = new Bird();
        System.out.println(myBird.getDescription()); // "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly."
    }
    
}
