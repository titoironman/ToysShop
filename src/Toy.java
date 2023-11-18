
public class Toy {
    private int id; // id игрушки
    private String name; // текстовое название
    private int quantity; // количество
    private double chanceRate; // частота выпадения игрушки (вес в % от 100)

    public Toy(int id, String name, int quantity, double chanceRate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chanceRate = chanceRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getChanceRate() {
        return chanceRate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setChanceRate(double chanceRate) {
        this.chanceRate = chanceRate;
    }
}