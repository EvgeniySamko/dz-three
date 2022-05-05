package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int clientOS = 0;

        int ios = 0;
        int android = 1;

        if (clientOS == ios) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        }
        if (android == clientOS) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2015;

        boolean Ios = 0 > 2015;
        boolean Android = 1 < 2015;

        if (Ios) {

            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else
            System.out.println(" Установите облегченную версию приложения для Ios по ссылке ");


        if (Android) {

            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");


        int year = 2022;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("2022 год является високосным.");
        } else
            System.out.println(" 2022 год не является високосным ");


        int deliveryDistance = 95;
        int delivery = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + delivery);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + (delivery + 1));
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + (delivery + 2));
        }


        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Ноябырь принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима.");
                break;
            default:
                System.out.println(" месяц не верен ");
        }
    }


}































