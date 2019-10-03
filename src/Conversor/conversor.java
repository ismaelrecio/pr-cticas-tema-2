/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class conversor {


    public static void main(String[] args) {
        final double EUR_DOLAR = 1.10;
        final double EUR_LIBRA = 1.25;
        final double EUR_YEN = 1.75;
        double euros;
        
  
  Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor que quieres convertir:");
        euros = teclado.nextDouble();
        double conDollar = euros * EUR_DOLAR;
       double conLibra= euros * EUR_LIBRA;
       double conYen= euros * EUR_YEN; 
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
