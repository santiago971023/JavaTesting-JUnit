package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleTest {

    //private Example example;

    //@BeforeEach
    //public void init(){
      //  this.example = new Example();
    //}

    @Test
    public void testSumar(){
        // Given -- Dado (Teniendo)
        Example example = new Example();
        int numberA = 3;
        int numberB = 3;

        // When -- Cuando
        int result = example.sumar(numberA, numberB);

        // Then -- Entonces
        assertEquals(6, result);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo(){
        // Given
        Example example = new Example();
        int number = 4;

        // When
        boolean result = example.checkPositivo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError(){
        // Given
        Example example = new Example();
        int number = -4;

        // Then
        assertThrows(IllegalArgumentException.class, () ->
                // When
                example.checkPositivo(number));
    }

    @Test
    public void testContarLetrasA(){
        // Given
        Example example = new Example();
        String word = "Santiago";
        // When
        int result = example.contarLetrasA(word);
        // Then
        assertEquals(2, result);
    }

    @Test
    public void testContieneElemento(){
        // Given
        Example example = new Example();
        List<String> lista = new ArrayList<>();
        lista.add("Santiago");
        lista.add("Dahián");
        lista.add("Víctor");

        String elemento = "Santiago";
        // When
        Boolean result = example.contieneElemento(lista, elemento);
        // Then
        assertTrue(result);
    }

    @Test
    public void testRevertirCadenas(){
        // Given
        Example example = new Example();
        String cadena = "Santiago";
        // When
        String result = example.revertirCadena(cadena);
        // Then
        assertEquals("ogaitnaS", result);
    }

    @Test
    public void testFactorial(){
        // Given
        Example example = new Example();
        int num = 8;

        // When
        long result = example.factorial(8);

        // Then
        assertEquals(40320, result);
    }

    @Test
    public void testFactorialError(){
        // Given
        Example example = new Example();
        int num = -8;

        // Then
        assertThrows(IllegalArgumentException.class, () ->
                example.factorial(num)); // When
    }

    @Test
    public void testEsPrimo(){
        // Given
        Example example = new Example();
        int numero = 5;

        // When
        boolean result = example.esPrimo(numero);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMenorQueUno(){
        // Given
        Example example = new Example();

        int numero = -4;

        // When
        boolean result = example.esPrimo(numero);

        // Then
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimo(){
        // Given
        Example example = new Example();

        int numero = 8;

        // When
        boolean result = example.esPrimo(numero);

        // Then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // Given
        Example example = new Example();
        // When
        String result = example.mensajeConRetraso();
        // Then
        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertirAString(){
        // Given
        Example example = new Example();
        List<Integer> listInt = List.of(1,2,3,4,5,6);

        // When
        List<String> result = example.convertirAString(listInt);

        // Then
        assertEquals(List.of("1", "2", "3", "4", "5", "6"), result);
    }

    @Test
    public void testCalcularMedia(){
        // Given
        Example example = new Example();
        List<Integer> list = List.of(1,2,3,4,5);
        // when
        Double result = example.calcularMedia(list);
        // then
        assertEquals(3, result);
    }

    @Test
    public void testCalcularMediaExceptionEmpty(){
        //Given
        Example example = new Example();
        List<Integer> list = new ArrayList<>();

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list); // when
        });

    }
    @Test
    public void testCalcularMediaExceptionNull(){
        //Given
        Example example = new Example();
        List<Integer> list = null;

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list); // when
        });

    }

    @Test
    public void testConvertirListaAString(){
        // Given
        Example example = new Example();
        List<Integer> integerList = List.of(1,2,3,4,5);
        // When
        List<String> stringList = example.convertirListaAString(integerList);
        // Then
        assertEquals(List.of("1", "2", "3", "4", "5"), stringList);

    }

}
