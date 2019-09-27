
package practicast2;

import java.util.Scanner;

/**
 *
 * @author Isma
 */
public class Factura {

   
    public static void main(String[] args) {
       int precio;
       Scanner teclado = new Scanner(System.in);
     final double IVA = 0.18;
        System.out.println("Introduce el precio del que quieres calcular la factura");
        precio=teclado.nextInt();
        System.out.printf("El precio con IVA es: %.2f %n", precio+(precio*IVA));
        System.out.printf("El precio sin IVA es:%d %n", precio);
    }
    
}
