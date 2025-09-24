package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        double bobSalary = 900320;
        double garySalary = 670290;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary being paid here is $"+highestSalary+".");
        //Question 2
        double carPrice = 32;
        double truckPrice = 42000;
        double bestDeal = Math.min(carPrice,truckPrice);
        System.out.println("The best deal here is the vehicle priced at $"+bestDeal+". That vehicle sure can fit a whole lot of spaghetti in it! Think of the savings.");

        //Question 3
        double radius = 7.25;
        double area = Math.round(Math.PI*(radius*radius));
        System.out.println("The area of a circle with a radius of "+radius+" is about "+area+".");

        //Question 4
        int number = 5;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of "+number+" is "+squareRoot+".");

        //Question 5
        //Point A (5,10) Point B (85,50)
        int pointAX = 5;
        int pointAY = 10;
        int pointBX = 85;
        int pointBY = 50;
        int pointX = pointBX - pointAX;
        int pointY = pointBY - pointAY;
        double distance = Math.sqrt((pointX*pointX)+(pointY*pointY));
        System.out.println("The distance between point A and point B is "+distance);

        //Question 6
        float negativeNumber = -3.8f;
        double absolute = Math.abs(negativeNumber);
        System.out.println("The absolute of "+negativeNumber+" is "+absolute+".");

        //Question 7
        double randomNumber = Math.random();
        System.out.println("Your number is "+randomNumber+"!");

        //Question 8
        int dayNumber = 24;
        int dayMinutes = (dayNumber*24)*60;
        double dayMilliseconds = dayMinutes*60000;
        System.out.println(dayNumber+" days have "+dayMinutes+" minutes; or  "+dayMilliseconds+" milliseconds.");

    }
}
