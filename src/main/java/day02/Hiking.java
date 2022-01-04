package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        double result = 0;
        for (int i = 0; i < heights.size() - 1; i++) {
            if (heights.get(i) < heights.get(i + 1)) {
                result += heights.get(i+1) - heights.get(i);
            }
        }
        return result;
    }
}
