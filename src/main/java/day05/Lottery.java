package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numberHalmaz;
    private int numberHuzas;
    Random random = new Random();

    public Lottery(int numberHalmaz, int numberHuzas) {
        // ellenőrizni kellene, hogy ne legyen engatív, és ne legyen több a numberof huzas
        this.numberHalmaz = numberHalmaz;
        this.numberHuzas = numberHuzas;
    }

    public List<Integer> startLottery() {
        List<Integer> result = new ArrayList<>();
        while (result.size() != numberHuzas) {
            int number = random.nextInt(numberHalmaz)+1;
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
