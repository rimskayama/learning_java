public class Detail {
    private String serialNumber;
    private String name;
    private double weight;


    public Detail(String serialNumber, String name, double weight) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.weight = weight;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return String.format("Серийный номер: %s, Название: %s, Вес: %.2f",
                serialNumber, name, weight);
    }
}