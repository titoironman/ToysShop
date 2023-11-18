public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addToy(1, "Конструктор", 5, 70);
        store.addToy(2, "Робот", 10, 60);
        store.addToy(3, "Кукла", 15, 50);
        store.addToy(4, "Дрон", 5, 40);
        store.addToy(5, "Самокат", 10, 30);
        store.addToy(6, "Велосипед", 15, 20);
        store.addToy(7, "Рогатка", 20, 10);

        store.changeChanceRate(1, 30);

        store.playLottery();

        Toy prizeToy = store.getWonToy();
        if (prizeToy != null) {
            System.out.println("Призовая игрушка: " + prizeToy.getName());
        }

        System.out.println();
    }
}