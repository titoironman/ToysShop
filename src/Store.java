import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> wonToys;
    private String filePath;

    public Store() {
        toys = new ArrayList<>();
        wonToys = new ArrayList<>();
        filePath = "src/won_toys_list.txt";

    }

    public void addToy(int id, String name, int quantity, double chanceRate) {
        Toy toy = new Toy(id, name, quantity, chanceRate);
        toys.add(toy);
    }

    public void changeChanceRate(int toyId, double newChanceRate) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setChanceRate(newChanceRate);
            }
        }
    }

    public void playLottery() {
        wonToys.clear();
        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getChanceRate()) {
                wonToys.add(toy);
            }
        }
    }
    public Toy getWonToy() {
        if (!wonToys.isEmpty()) {
            Toy wonToy = wonToys.remove(0);
            wonToy.setQuantity(wonToy.getQuantity() - 1);
            try {
                FileWriter writer = new FileWriter(filePath, true);
                writer.write(wonToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи файла");
            }

            return wonToy;
        } else {
            System.out.println("Призовые игрушки кончились");
            return null;
        }
    }
}