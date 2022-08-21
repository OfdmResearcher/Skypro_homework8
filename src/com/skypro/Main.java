package com.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        checkYearIsLeapOrNot(2000); // task 1
        installTheAppDependsOnTheYearAndOS(0, 2022); //task 2
        System.out.println("days = " + countDaysForDelivery(95)); // task 3

    }

    public static void checkYearIsLeapOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - is a leap year");
        } else {
            System.out.println(year + " - is a not leap year");
        }
    }

    public static void installTheAppDependsOnTheYearAndOS(int clientOS, int clientDeviceYear) {
        // 0 - iOS, 1 - Android
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Please, install the app for Android, using this link");
        } else if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Please, install the app for iOS, using this link");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Please, install the light version of app for Android, using this link");
        } else {
            System.out.println("Please, install the light version of app for iOS, using this link");
        }
    }

    public static int countDaysForDelivery(int deliveryDistance) {
        // -1 - the delivery is impossible at that day
        int days = 1;
        if (deliveryDistance <= 20) {
            return days;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days++;
            return days;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days+=2;
            return days;
        } else {
            return -1;
        }
    }
}
