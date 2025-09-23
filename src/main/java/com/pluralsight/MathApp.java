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
        double number = 5;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of "+number+" is "+squareRoot+".");
    }
}
