package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;

import javax.xml.stream.events.EndDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    //Test sum()
    @Test
    void sum() {
        Main main = new Main();
        int resultado = main.sum(5, 5);
        assertEquals(10, resultado);
    }
    @Test
    void sumMax(){
        Main main = new Main();
        int resultado = main.sum(Integer.MAX_VALUE, 1);
        assertNotEquals("2147483648", resultado);
    }
    @Test
    void sumNegatives(){
        Main main = new Main();
        int resultado = main.sum(-1, -40);
        assertEquals(-41, resultado);
    }
    //END
    //Test divide()
    @Test
    void divide() {
        Main main = new Main();
        double resultado = main.divide(100, 2);
        assertEquals(50, resultado);
    }
    @Test
    void divideZero(){
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.divide(100, 0));
    }
    @Test
    void divideDouble(){
        Main main = new Main();
        double resultado = main.divide(15, 35);
        assertEquals(0.42857142857142855, resultado);
    }
    //END
    //Test concatenate()
    @Test
    void concatenate() {
        Main main = new Main();
        String resultado = main.concatenate("Hola", "Mundo");
        assertEquals("HolaMundo", resultado);
    }
    @Test
    void concatenateNulls(){
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.concatenate("Hola", null));
    }
    //END
    //Test isPrime()
    @Test
    void isPrime() {
        Main main = new Main();
        boolean resultado = main.isPrime(3);
        assertTrue(resultado);
    }
    @Test
    void numberLowerThanOne(){
        Main main = new Main();
        boolean resultado = main.isPrime(-5);
        assertFalse(resultado);
    }
    //END
    //Test
    @Test
    void factorial() {
        Main main = new Main();
        int resultado = main.factorial(5);
        assertEquals(120, resultado);
    }
    @Test
    void factorialOfZero(){
        Main main = new Main();
        int resultado = main.factorial(0);
        assertEquals(1, resultado);
    }
    @Test
    void factorialOfOne(){
        Main main = new Main();
        int resultado = main.factorial(1);
        assertEquals(1, resultado);
    }
    @Test
    void factorialNegative(){
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.factorial(-2));
    }
    //END
    //Test fibonacciSequence()
    @Test
    void fibonacciSequence() {
        Main main = new Main();
        List<Integer> resultado = main.fibonacciSequence(7);
        List<Integer> expected = Arrays.asList(0,1,1,2,3,5,8);
        assertEquals(expected, resultado);
    }
    @Test
    void numberLowerThanZero(){
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.fibonacciSequence(-1));
    }
    //END
    //Test calculateCircleArea()
    @Test
    void calculateCircleArea() {
        Main main = new Main();
        double resultado = main.calculateCircleArea(15);
        assertEquals(706.8583470577034, resultado);
    }
    @Test
    void doubleNumber(){
        Main main = new Main();
        double resultado = main.calculateCircleArea(15.77);
        assertEquals(781.291787639941, resultado);
    }
    @Test
    void radiusMinorThanZero(){
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.calculateCircleArea(-15));
    }
    //END
    //Test bubbleSort()
    @Test
    void bubbleSort() {
        Main main = new Main();
        int[] aux = {3,4,2,32,6,233,5,455,100};
        int[] resultado = main.bubbleSort(aux);
        int[] expected = {2,3,4,5,6,32,100,233,455};
        assertEquals(expected.length, resultado.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], resultado[i]);
        }
    }
    @Test
    void bubbleSortNull(){
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.bubbleSort(null));
    }
    //END
    //Test getSameObject()
    @Test
    void getSameObject() {
        Main main = new Main();
        App aux = new App();
        Object resultado = main.getSameObject(aux);
        assertEquals(aux, resultado);
    }
    @Test
    void getSameObjectNull(){
        Main main = new Main();
        assertEquals(null, main.getSameObject(null));
    }
    //END
    //Test getDifferentObject()
    @Test
    void getDifferentObject() {
        Main main = new Main();
        App aux = new App();
        Object resultado = main.getSameObject(aux);
        assertEquals(aux, resultado);
    }
    //END
    //Test timeOut()
    @Test
    void timeOut() {
        assertDoesNotThrow(()-> {
            Main main = new Main();
            main.timeOut();
        });
    }
}