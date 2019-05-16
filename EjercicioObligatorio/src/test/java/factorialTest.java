
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class factorialTest {
    
    @Test
    public void testFactorial_numero1() {
        System.out.println("un numero menor a 0");
        int numero = -1;
        factorial factorial1 = new factorial();
        Object resultado = factorial1.factorial(numero);
        assertTrue(resultado instanceof String);
        assertEquals("Esta función solo acepta números positivos o cero!!!", resultado.toString());
    }
    
    @Test
    public void testFactorial_numero2() {
        System.out.println("un numero mayor a 100");
        int numero = 101;
        factorial factorial1 = new factorial();
        Object resultado = factorial1.factorial(numero);
        double esperado = 9999999999d;
        assertTrue(resultado instanceof Double);
        //assertEquals(esperado, Double.parseDouble(resultado.toString()));
        assertTrue(esperado == Double.parseDouble(resultado.toString()));
    }
    
    
    
    @Test
    public void testFactorial_numero3() {
        System.out.println("un arreglo menor a 0");
        int[] numero = {-1,2,3};
        factorial factorial1 = new factorial();
        Object resultado = factorial1.factorial(numero);
        assertEquals("Esta función solo acepta números positivos o cero!!!", resultado);
    }

    @Test
    public void testFactorial_numero4() {
        System.out.println("un arreglo mayor a 100");
        int[] numero = {101,2,3};
        factorial factorial1 = new factorial();
        Object resultado = factorial1.factorial(numero);
        double esperado = 9999999999d;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testFactorial_numero5() {
        System.out.println("un arreglo entre 0 y 100");
        int[] numero = {1,2,3,4};
        factorial factorial1 = new factorial();
        Object resultado = factorial1.factorial(numero);
        Long[] esperado = {1l,2l,6l,24l};
        assertTrue(resultado instanceof Long[]);
        assertArrayEquals(esperado, (Long[]) resultado);
    }
       
    
}
