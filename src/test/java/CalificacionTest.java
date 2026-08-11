import com.valery.testing.Calificacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalificacionTest {

    @Test
    void calcularPromedioCaso1() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        double resultado = calificacion.calcularPromedio(15, 14, 16);
        
        // Assert
        assertEquals(15.0, resultado);
    }

    @Test
    void calcularPromedioCaso2() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        double resultado = calificacion.calcularPromedio(10, 12, 14);
        
        // Assert
        assertEquals(12.0, resultado);
    }

    @Test
    void calcularPromedioCaso3() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        double resultado = calificacion.calcularPromedio(20, 18, 16);
        
        // Assert
        assertEquals(18.0, resultado);
    }

    @Test
    void estaAprobadoPromedio15() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        boolean resultado = calificacion.estaAprobado(15.0);
        
        // Assert
        assertTrue(resultado);
    }

    @Test
    void estaAprobadoPromedio13Limite() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        boolean resultado = calificacion.estaAprobado(13.0);
        
        // Assert
        assertTrue(resultado);
    }

    @Test
    void estaAprobadoPromedio12() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        boolean resultado = calificacion.estaAprobado(12.0);
        
        // Assert
        assertFalse(resultado);
    }

    @Test
    void estaAprobadoPromedio5() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        boolean resultado = calificacion.estaAprobado(5.0);
        
        // Assert
        assertFalse(resultado);
    }

    @Test
    void estaAprobadoPromedio12_9Reto() {
        // Arrange
        Calificacion calificacion = new Calificacion();
        
        // Act
        boolean resultado = calificacion.estaAprobado(12.9);
        
        // Assert
        // Análisis de valor límite: Garantiza que el sistema no redondea automáticamente hacia arriba 
        // y aprueba al estudiante por error.
        assertFalse(resultado);
    }
}
