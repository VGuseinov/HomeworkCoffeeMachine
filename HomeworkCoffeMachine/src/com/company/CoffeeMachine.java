package com.company;


import java.util.Scanner;

public abstract class CoffeeMachine implements Function{

    public Scanner sc = new Scanner(System.in);
    public int water, coffee;
    private int waterTank, coffeeTank, fullWaterTank, fullCoffeeTank;
    private String name, manufacturer;

    public void setWaterTank(int waterTank) {
        this.waterTank = waterTank;
    }

    public void setCoffeeTank(int coffeeTank) {
        this.coffeeTank = coffeeTank;
    }

    public void setFullWaterTank(int fullWaterTank) {
        this.fullWaterTank = fullWaterTank;
    }

    public void setFullCoffeeTank(int fullCoffeeTank) {
        this.fullCoffeeTank = fullCoffeeTank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }



    @Override
    public void mainMenu() {
        int menuOption = 0;
        while (menuOption != 8) {
            System.out.println("1. Показать текущий объем воды и кофе");
            System.out.println("2. Приготовить \"Американо\"");
            System.out.println("3. Приготовить \"Эспрессо\"");
            System.out.println("4. Пиготовить \"Двойной эспрессо\"");
            System.out.println("5. Заполнить бак с водой");
            System.out.println("6. Заполнить бак с кофе");
            System.out.println("7. Информация");
            System.out.println("8. Завершить работу");
            menuOption = this.sc.nextInt();
            switch (menuOption) {
                case 1:
                    showVolumeWaterAndCoffee();
                    break;
                case 2:
                    makeAmericano();
                    break;
                case 3:
                    makeEspresso();
                    break;
                case 4:
                    makeDoubleEspresso();
                    break;
                case 5:
                    fillWaterTank();
                    break;
                case 6:
                    fillCoffeeTank();
                    break;
                case 7:
                    showInformation();
                    break;
                case 8:
                    System.out.println("-----------------");
                    System.out.println("Работа завершена!");
                    System.out.println("-----------------");
                    stopWork();
                    break;
            }
        }
    }

    @Override
    public void showVolumeWaterAndCoffee() {
        System.out.println("------------------------");
        System.out.println("Колличество воды " + this.waterTank + " мг");
        System.out.println("Колличество кофе " + this.coffeeTank + " г");
        System.out.println("------------------------");
    }

    @Override
    public void makeAmericano() {
        this.water = 150;
        this.coffee = 30;
        if (this.waterTank >= this.water && this.coffeeTank >= this.coffee ) {
            this.waterTank -= this.water;
            this.coffeeTank -= this.coffee;
            System.out.println("---------------");
            System.out.println("Американо готов");
            System.out.println("---------------");
        } else {
            System.out.println("--------------");
            System.out.println("Заполните баки");
            System.out.println("--------------");
        }
    }

    @Override
    public void makeEspresso() {
        this.water = 40;
        this.coffee = 15;
        if (this.waterTank >= this.water && this.coffeeTank >= this.coffee ) {
            this.waterTank -= this.water;
            this.coffeeTank -= this.coffee;
            System.out.println("--------------");
            System.out.println("Эспрессо готов");
            System.out.println("--------------");
        } else {
            System.out.println("--------------");
            System.out.println("Заполните баки");
            System.out.println("--------------");
        }
    }

    @Override
    public void makeDoubleEspresso() {
        this.water = 40;
        this.coffee = 30;
        if (this.waterTank >= this.water && this.coffeeTank >= this.coffee ) {
            this.waterTank -= this.water;
            this.coffeeTank -= this.coffee;
            System.out.println("----------------------");
            System.out.println("Двойной эспрессо готов");
            System.out.println("----------------------");
        } else {
            System.out.println("--------------");
            System.out.println("Заполните баки");
            System.out.println("--------------");
        }
    }

    @Override
    public void fillWaterTank() {
        this.waterTank = this.fullWaterTank;
    }

    @Override
    public void fillCoffeeTank() {
        this.coffeeTank = this.fullCoffeeTank;
    }

    @Override
    public void showInformation() {
        System.out.println("----------------------------");
        System.out.println("Марка " + this.name);
        System.out.println("Страна производитель: " + this.manufacturer);
        System.out.println("Обьем бака воды: " + this.waterTank + " мл");
        System.out.println("Объем бака с кофе: " + this.coffeeTank + " г");
        System.out.println("----------------------------");
    }

    @Override
    public void stopWork() {
        System.exit(0);
    }
}
