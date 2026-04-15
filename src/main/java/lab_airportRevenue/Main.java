package labs.lab1_airportRevenue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите название аэропорта (или 'exit' для выхода): ");
            String airportName = scanner.nextLine();

            if (airportName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Введите стоимость билета: ");
            double ticketCost = 0;

            try {
                ticketCost = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(
                        "Ошибка: Стоимость должна быть числом. Попробуйте снова.");
                continue;
            }

            System.out.print("Введите общее число мест во всех самолетах: ");
            int totalSeatCount = 0;

            try {
                totalSeatCount = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(
                        "Ошибка: число мест должно быть числом. Попробуйте снова.");
                continue;
            }

            System.out.print("Введите общее число проданных билетов: ");
            int soldTicketsCount = 0;

            try {
                soldTicketsCount = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(
                        "Ошибка: число проданных билетов должно быть числом. Попробуйте снова.");
                continue;
            }

            Airport airport = new Airport
                    (airportName, ticketCost, totalSeatCount,soldTicketsCount);
            System.out.println(
                    "Общая стоимость всех проданных билетов аэропорта " +
                    airport.getAirportName() + ": " + airport.calculateTotalRevenue());
        }
        scanner.close();
        System.out.println("Программа завершена.");
    }
}