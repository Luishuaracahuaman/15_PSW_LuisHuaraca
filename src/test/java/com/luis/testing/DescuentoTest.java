package com.luis.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescuentoTest {

    @Test
    void calcularPrecioFinal_10PorCiento() {
        // Arrange
        Descuento descuentoObj = new Descuento();
        
        // Act
        double resultado = descuentoObj.calcularPrecioFinal(100, 10);
        
        // Assert
        assertEquals(90.0, resultado);
    }

    @Test
    void calcularPrecioFinal_20PorCiento() {
        // Arrange
        Descuento descuentoObj = new Descuento();
        
        // Act
        double resultado = descuentoObj.calcularPrecioFinal(200, 20);
        
        // Assert
        assertEquals(160.0, resultado);
    }

    @Test
    void calcularPrecioFinal_0PorCiento() {
        // Arrange
        Descuento descuentoObj = new Descuento();
        
        // Act
        double resultado = descuentoObj.calcularPrecioFinal(50, 0);
        
        // Assert
        assertEquals(50.0, resultado);
    }

    @Test
    void calcularPrecioFinal_50PorCiento() {
        // Arrange
        Descuento descuentoObj = new Descuento();
        
        // Act
        double resultado = descuentoObj.calcularPrecioFinal(500, 50);
        
        // Assert
        assertEquals(250.0, resultado);
    }

    @Test
    void calcularPrecioFinal_100PorCientoLimiteSuperior() {
        // Arrange
        Descuento descuentoObj = new Descuento();
        
        // Act
        double resultado = descuentoObj.calcularPrecioFinal(100, 100);
        
        // Assert
        // Elegí este caso para probar el límite superior de un descuento (el 100%), 
        // para garantizar que el sistema calcula correctamente que el producto pasa 
        // a ser totalmente gratis (precio 0) y no arroja errores matemáticos o valores negativos.
        assertEquals(0.0, resultado);
    }
}
