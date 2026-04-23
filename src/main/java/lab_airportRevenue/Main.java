package labs.lab1_airportRevenue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Система расчёта выручки аэропортов ---\n");

        while (true) {
            // название аэропорта
            System.out.print("Введите название аэропорта (или 'exit' для выхода): ");
            String airportName = scanner.nextLine();
            if (airportName.equalsIgnoreCase("exit")) {
                break;
            }

            // стоимость билета
            double ticketCost = 0;
            while (true) {
                System.out.print("Введите стоимость билета: ");
                try {
                    ticketCost = Double.parseDouble(scanner.nextLine());
                    if (ticketCost <= 0) {
                        System.out.println("Ошибка: стоимость должна быть больше нуля.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: стоимость должна быть числом. Попробуйте снова.");
                }
            }

            // общее число мест
            int totalSeatCount = 0;
            while (true) {
                System.out.print("Введите общее число мест во всех самолетах: ");
                try {
                    totalSeatCount = Integer.parseInt(scanner.nextLine());
                    if (totalSeatCount <= 0) {
                        System.out.println("Ошибка: число мест должно быть больше нуля.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: число мест должно быть числом. Попробуйте снова.");
                }
            }
            // число проданных билетов
            int soldTicketsCount = 0;
            while (true) {
                System.out.print("Введите общее число проданных билетов: ");
                try {
                    soldTicketsCount = Integer.parseInt(scanner.nextLine());
                    if (soldTicketsCount <= 0) {
                        System.out.println("Ошибка: число проданных билетов должно быть больше нуля.");
                        continue;
                    }
                    if (soldTicketsCount > totalSeatCount) {
                        System.out.println("Ошибка: проданных билетов не может быть больше мест (" + totalSeatCount + ").");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: число проданных билетов должно быть числом. Попробуйте снова.");
                }
            }

            // создание объекта
            try {
                Airport airport = new Airport(airportName, ticketCost, totalSeatCount, soldTicketsCount);
                System.out.println(
                        "Общая стоимость всех проданных билетов аэропорта " +
                                airport.getAirportName() + ": " + airport.calculateTotalRevenue()
                );
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ". Попробуйте ввести данные заново.\n");
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}