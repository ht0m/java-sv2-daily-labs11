package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numberHalmaz;
    private int numberHuzas;
    Random random = new Random();

    public Lottery(int numberHalmaz, int numberHuzas) {
        if (numberHalmaz <= 0 || numberHuzas <= 0) {
            throw new IllegalArgumentException("Parameteres must be positive!");
        }
        if (numberHalmaz < numberHuzas) {
            throw new IllegalArgumentException("First parameter must be bigger than second one!");
        }

        this.numberHalmaz = numberHalmaz;
        this.numberHuzas = numberHuzas;
    }

    public List<Integer> startLottery() {
        List<Integer> result = new ArrayList<>();
        while (result.size() != numberHuzas) {
            int number = random.nextInt(1, numberHalmaz + 1);
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
