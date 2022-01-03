package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testAdminUser() {
        User user  = new AdminUser("laci@gmail.com", "jelszo333");
        assertEquals("laci@gmail.com", user.getUserEmail());
        assertEquals("*********", user.getPassword());
    }

}