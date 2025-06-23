package com.ejemplo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Prueba unitaria para la aplicación simple usando JUnit 5.
 */
public class AppTest {

    /**
     * Prueba simple para verificar que el entorno de prueba funciona.
     */
    @Test
    @DisplayName("Prueba")
    void testApp() {
        assertTrue(true, "Esta prueba siempre debe pasar.");
    }
}
