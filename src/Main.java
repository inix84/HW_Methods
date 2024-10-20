import java.time.LocalDate;

public class Main {
    public static void checkingLeapYear(int year2) {
        if (year2 % 4 != 0) {
            System.out.println(year2 + " год не является високосным.");
        } else if (year2 % 100 == 0 && year2 % 400 != 0) {
            System.out.println(year2 + " год не является високосным.");
        } else {
            System.out.println(year2 + " год является високосным.");
        }
        System.out.println();
    }

    public static void ResolvesInstallingOS(int clientOS2, int clientDeviceYear2) {

        if (clientOS2 == 0) {
            if (clientDeviceYear2 < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке--->");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке --->");
            }
        } else {
            if (clientDeviceYear2 < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке--->");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке --->");
            }
        }
        System.out.println();
    }

    public static void calculationDeliveryDistance(int deliveryDistance2) {
        if (deliveryDistance2 < 20) {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance2 +
                    " км. Потребуется 1 день");
        } else if (deliveryDistance2 >= 20 && deliveryDistance2 < 60) {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance2 +
                    " км. Потребуется 2 дня");
        } else if (deliveryDistance2 >= 60 && deliveryDistance2 < 100) {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance2 +
                    " км. Потребуется 3 дня");
        } else {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance2 +
                    " км. Доставки нет");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Задача 1. Про високосный год:");
        int year = 2000; // проверяемый год
        checkingLeapYear(year);
        System.out.println("Задача 2. Про операционные системы (хард):");
        int clientOS = 1; //0 — iOS, 1 — Android
        int clientDeviceYear = LocalDate.now().getYear(); // год выпуска
        ResolvesInstallingOS(clientOS, clientDeviceYear);
        System.out.println("Задача 3. Про доставку банковских карт:");
        int deliveryDistance = 195; // дистанция до клиента
        calculationDeliveryDistance(deliveryDistance);
    }

}