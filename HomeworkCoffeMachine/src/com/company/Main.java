package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachine siemens = new Siemens();
        CoffeeMachine philips = new Philips();
        CoffeeMachine delonghi = new Delonghi();

        int menuOption = 0;
        System.out.println("-----------------");
        System.out.println("Добро пожаловать!");
        System.out.println("-----------------");
        System.out.println();
        while (menuOption != 4) {
            System.out.println("Выберите кофемашину!");
            System.out.println("1. Siemens");
            System.out.println("2. Philips");
            System.out.println("3. Delonghi");
            System.out.println("4. Завершить работу");
            menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                    siemens.mainMenu();
                    break;
                case 2:
                    philips.mainMenu();
                    break;
                case 3:
                    delonghi.mainMenu();
                case 4:
                    System.out.println("------------");
                    System.out.println("До свидания!");
                    System.out.println("------------");
                    break;
                default:
                    System.out.println("----------------------");
                    System.out.println("Некорректная операция!");
                    System.out.println("----------------------");
            }
        }
    }
}
