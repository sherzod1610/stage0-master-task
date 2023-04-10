package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int firstDigit = number % 10;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number / 100;
        int reversedNumber = firstDigit * 100 + secondDigit * 10 + thirdDigit;
        System.out.println(reversedNumber);
    }
}
