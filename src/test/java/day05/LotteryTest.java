package day05;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @RepeatedTest(10)
    void testStartLottery() {
        Lottery lottery = new Lottery(90,5);
        List<Integer> result = lottery.startLottery();
        System.out.println(result);

        assertEquals(5, result.size());

        for (int i=0;i<result.size();i++) {
            assertFalse(result.subList(i+1,result.size()).contains(result.get(i)));
        }
    }
}