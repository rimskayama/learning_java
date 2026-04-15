import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = Warehouse.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Система управления складом ---");

        while (true) {
            System.out.print("\nВведите название детали (или 'exit' для выхода): ");
            String name = scanner.nextLine();


            if (name.equalsIgnoreCase("exit")) {
                break;
            }


            System.out.print("Введите серийный номер: ");
            String sn = scanner.nextLine();


            System.out.print("Введите вес детали: ");
            double weight = 0;
            try {
                weight = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Вес должен быть числом. Попробуйте снова.");
                continue;
            }

            Detail newDetail = new Detail(sn, name, weight);
            warehouse.addDetail(newDetail);
        }


        // Вывод всех добавленных деталей
        warehouse.showInventory();
        scanner.close();
        System.out.println("Программа завершена.");
    }
}