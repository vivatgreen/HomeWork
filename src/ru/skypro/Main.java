package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte horse = 1;
        short cats = 2;
        int cows = 3;
        long ducks = 1122L;
        var snakes = 127;
        float lionWeight = 135.5f;
        double elephantWeight = 1.2564;
        boolean uncleIsAdult = 45 < 55;
        System.out.println(uncleIsAdult);
        char name = 22;
        System.out.println(name);

        // Задание 2
        double boxerOneWeight = 78.2;
        double boxerTwoWeight = 82.7;
        double weightAllBoxers = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес боксёров равен " + weightAllBoxers + " кг!");
        double boxersWeightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница весов между боксёрами " + boxersWeightDifference + " кг!");

    }
}
