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
        Scanner teclado = new Scanner(System.in);
        int euro = teclado.nextInt();
        double dollar = euro * 1.10;
        double yen = euro * 1.30;
        System.out.printf("%d euros son %.2f dolares y son %.2f yenes", euro, dollar,yen);
    }
}
