/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Usuario DAM 1
 */
public class conversiones {
    public static void main(String[] args) {
        byte numeroByte=54;
        System.out.printf("el valor del byte es:%d%n", numeroByte);
      long numeroLong = (long)numeroByte;
        System.out.printf("el valor del bytes es:%d%n", numeroLong);
        
        int numeroInt= 5;
        double numeroDouble= (double) numeroInt;
        System.out.printf("el valor del integer es: %d%n", numeroInt);
        System.out.printf("el valor del double es: %.2f %n",numeroDouble);
        
        String palabra= "a";
        System.out.printf("el valor de la palabra es: %s %n", palabra);
        int numeroPalabra = Integer.parseInt(palabra);
        System.out.printf("el valor del numeros es de: %d%n",numeroPalabra);
        
        
        
        int numeroPalabraDos= 123;
        String palabraNumero= String.valueOf(numeroPalabraDos);
        System.out.printf("el valor de la palabra:%s%n",palabraNumero);
             
        
        
        
    }
}
