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

        // Задание 3
        int bananas = 5;
        int oneBananasWeightGr = 80;
        int allBananasWeightGr = bananas * oneBananasWeightGr;
        int milkWeightMl = 200;
        int milk100MlPerGr = 105;
        int allMilkWeightGr = milk100MlPerGr * 2;
        int iceCreamSundaeBricks = 2;
        int oneIceCreamSundaeBrickWeightGr = 100;
        int iceCreamSundaeBricksWeightGr = iceCreamSundaeBricks * oneIceCreamSundaeBrickWeightGr;
        int rawEggs = 4;
        int oneRawEggsWeightGr = 70;
        int allRawEggsWeightGr = rawEggs * oneRawEggsWeightGr;
        int allProductsWeightGr = allBananasWeightGr + allMilkWeightGr + iceCreamSundaeBricksWeightGr + allRawEggsWeightGr;
        int grPerKg = 1000;
        float allProductsKG = allProductsWeightGr / (float) grPerKg;
        System.out.println("Общий вес рецепта " + allProductsKG + " кг!");

        // Задание 4
        int boxerNeedsToLoseWeightKg = 7;
        int boxerLosesInOneDayWeightGr = 250;
        int boxerNeedsToLoseWeightGr = boxerNeedsToLoseWeightKg * grPerKg;
        int itTakesDaysLoseWeight = boxerNeedsToLoseWeightGr / boxerLosesInOneDayWeightGr;
        System.out.println("Боксёру нужно " + itTakesDaysLoseWeight + " дней чтобы похудеть на 7 кг по 250 гр в день");

        int losesBoxerInOneDayWeightGr = 500;
        int takesItDaysLoseWeight = boxerNeedsToLoseWeightGr/ losesBoxerInOneDayWeightGr;
        System.out.println("Боксёру нужно " + takesItDaysLoseWeight + " дней чтобы похудеть на 7 кг по 500 гр в день");

        int onAvarage = (itTakesDaysLoseWeight + takesItDaysLoseWeight) / 2;
        System.out.println("В среднем потребуется " + onAvarage + " дней для похудения на 7 кг!");

        // Задание 5

    }
}
