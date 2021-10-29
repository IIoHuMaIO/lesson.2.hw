package com.company;

public class Main {

    public static void main(String[] args) {
        tempAge(29, 25);
        tempAge(-15, 67);
        tempAge(17, 21);
        tempAge(-1, 11);
        tempAge(2, 9);

    }

    public static String tempAge(int temperature, int ageOfPeople) {
        System.out.println("Температура " + temperature + " " + "Возраст " + ageOfPeople  );

        if (ageOfPeople > 20 && ageOfPeople < 45 && temperature > 20 && temperature < 30) {
            System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        }
        if (ageOfPeople > 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        }
        if (ageOfPeople > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
            return "Можно идти гулять";
        } else {
            System.out.println("Оставайтесь дома");
            return "Оставайтесь дома";
        }

    }
}
