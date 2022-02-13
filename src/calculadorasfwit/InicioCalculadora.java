/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasfwit;
import java.util.Scanner;

/**@author igyar*/
public class InicioCalculadora {

    public static void main(String[] args) {

        int opc; double numero1 = 0,numero2 = 0;
        Scanner read = new Scanner(System.in);
        FuncionesCalculadora funciones = new FuncionesCalculadora();
        
        System.out.println("********* BIENVENIDA A LA CALCULADORA ********* ");
        
        do{
        System.out.println("    - Selecciona una función a utilizar - ");
        System.out.println(" \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Salir");
        opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa número 1: ");
                    numero1 = read.nextDouble();
                    System.out.println("Ingresa número 2: ");
                    numero2 = read.nextDouble();
                    System.out.println("La suma es: " + funciones.Sumar(numero1,numero2));
                    break;
                case 2:
                    System.out.println("Ingresa número 1: ");
                    numero1 = read.nextDouble();
                    System.out.println("Ingresa número 2: ");
                    numero2 = read.nextDouble();
                    System.out.println("La resta es: " + funciones.Restar(numero1,numero2));
                    break;
                case 3:
                    System.out.println("Ingresa número 1: ");
                    numero1 = read.nextDouble();
                    System.out.println("Ingresa número 2: ");
                    numero2 = read.nextDouble();
                    System.out.println("La multiplicacion es  es: " + funciones.Multiplicar(numero1,numero2));  
                    break;
                case 4:
                    
                    System.out.println("Ingresa número 1: ");
                    numero1 = read.nextDouble();
                    System.out.println("Ingresa número 2: ");
                    numero2 = read.nextDouble();
                    System.out.println("La división es: " + funciones.Dividir(numero1,numero2));                    
                    break;
                case 5:
                    System.out.println("Bye");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 5);

    }
    
}
