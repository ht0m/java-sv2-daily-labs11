package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {
    @Test
    void testNormalUser() {
        NormalUser normal = new NormalUser("laci@gmail.com", "jelszo333");
        assertEquals("laci@gmail.com", normal.getUserEmail());
        assertEquals("jelszo333", normal.getPassword());
    }

}