package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testHiking() {

        List<Double> heights = new ArrayList<>(Arrays.asList(10.0,20.0,25.0,18.0));
        assertEquals(15.0,new Hiking().getPlusElevation(heights));

        List<Double> heights2 = new ArrayList<>(Arrays.asList(0.0,20.0));
        assertEquals(20.0,new Hiking().getPlusElevation(heights2));

        List<Double> heights3 = new ArrayList<>(Arrays.asList(20.0,10.0,15.0,15.0));
        assertEquals(5.0,new Hiking().getPlusElevation(heights3));
    }
}