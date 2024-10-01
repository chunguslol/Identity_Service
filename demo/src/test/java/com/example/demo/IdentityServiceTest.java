package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdentityServiceTest {

    private final IdentityService identityService = new IdentityService();

    @Test
    public void testExistsByCI() {
        assertTrue(identityService.existsByCI("12345678"));
        assertFalse(identityService.existsByCI("87654321"));
    }
}