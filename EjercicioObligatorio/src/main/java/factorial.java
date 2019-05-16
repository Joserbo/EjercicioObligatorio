
import java.lang.reflect.Array;
import java.util.ArrayList;

public class factorial {

    public static final Long MAYOR = 9999999999l;

    public Object factorial(int numero) {
        String mensaje = "";
        Long resultado=1l;
        if (numero < 0) {
            mensaje = "Esta función solo acepta números positivos o cero!!!";
            return mensaje;
        } else if (numero > 100) {
            return MAYOR;
        } else {    
            if(numero == 0)
            {
                resultado = 1l;
            }
            if(numero == 1)
            {
                resultado = 1l;
            }
            else{
                Long temp = 1l;
                for (int i = 1; i <= numero; i++) {
                    temp *= i;
                    resultado = temp;
                }
            }
            return resultado;
        }

    }

    public Object factorial(int[] numero) {
        Long[] resultados = new Long[numero.length];
        for (int j = 0; j < numero.length; j++) {
            String mensaje = "";
            Long resultado = 1l;
            if (numero[j] < 0) {
                mensaje = "Esta función solo acepta números positivos o cero!!!";
                return mensaje;
            } else if (numero[j] > 100) {
                return MAYOR;
            } else {
                if(numero[j]==1)
                {
                    resultados[j] = 1l;
                }
                if(numero[j]==0)
                {
                    resultados[j] = 1l;
                }
                else{
                Long temp = 1l;
                for (int i = 1; i <= numero[j]; i++) {
                    temp *= i;
                    resultado = temp;
                }
                 resultados[j] = resultado;
                }
            }
        }
        return resultados;
    }
}
