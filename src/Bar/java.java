/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bar;
import java.util.Scanner;
/**
 *
 * @author Usuario DAM 1
 */
public class java {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("ENTRADA");
        System.out.println("Numero de bebidas");
      int bebidas=teclado.nextInt();
         System.out.println("Numero de bocadillos");
      int bocadillos=teclado.nextInt();
        System.out.println("SALIDA");
        double coste1=1.25;
        double coste2=2.05;
        System.out.println("Coste de las bebidas"+ bebidas*coste1);
        System.out.println("Coste de los bocadillos"+bocadillos*coste2);
        
     
        
      
        
      
      
        
    }
}
