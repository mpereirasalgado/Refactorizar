package refactorizar;

import java.util.Scanner;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar 
{
    public static void main(String[] args) 
    {
        boolean p = false;
        int longitud = 0;
        int contador_digitos = 0;
        longitud = entradaDato();
        
        if (longitud <= 0) 
        {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) 
        {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) 
            {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contador_digitos = contador;

            if (contador_digitos == longitud) 
            {
                if (i < 4) 
                {
                    p = true;
                } else {
                    if (i % 2 == 0) 
                    {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) 
                        {
                            limite--;
                        }

                        while (i1 <= limite) 
                        {
                            if (i % i1 == 0) 
                            {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) 
                            {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) 
                        {
                            p = true;
                        }
                    }
                }

                if (p == true) 
                {
                    System.out.println(i);
                }
            }
        }
    }

    private static int entradaDato() {
        int longitud;
        System.out.println("Numero de digitos deseados : ");
        Scanner dato = new Scanner(System.in);
        longitud = dato.nextInt();
        return longitud;
    }

}
