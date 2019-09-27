/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomina;

import java.util.Scanner;

/**
 *
 * @author Isma
 */
public class Nomina {
    
    public static void main(String[] args) {
        System.out.println("por favor introduce sueldo bruto");
        Scanner teclado= new Scanner(System.in);
        int brutoAnual=teclado.nextInt();
        System.out.println("POR FAVOR INTRODUCE EL NUMERO DE PAGAS");
        int pagas=teclado.nextInt();
        int brutoMes= brutoAnual/pagas;
        System.out.printf("El salario bruto anual es %d %n ",brutoAnual);
        double netoAnual= brutoAnual-(brutoAnual*0.15);
        System.out.printf("El salario neto anual es de %.2f %n", netoAnual);
        double netoMensual= netoAnual/pagas;
        System.out.printf("El salario neto mensual es de %.2f %n ", netoMensual);
        
    }
         
}
    
