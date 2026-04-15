import java.util.ArrayList;
import java.util.List;


public class Warehouse {
    // единственный экземпляр класса
    private static Warehouse instance;
    // контейнер
    private List<Detail> details;


    // приватный конструктор
    private Warehouse() {
        details = new ArrayList<>();
        details.add(new Detail("A-100", "Шестерня (базовая)", 2.5));
        details.add(new Detail("B-200", "Вал (базовый)", 15.0));
    }


    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }


    public void addDetail(Detail detail) {
        details.add(detail);
        System.out.println("Система: Деталь " + detail.getName() + " добавлена.");
    }


    public void showInventory() {
        System.out.println("\n--- Текущий инвентарь склада ---");
        for (Detail detail : details) {
            System.out.println(detail);
        }
    }
}