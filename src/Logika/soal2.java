/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.Scanner;

/**
 *
 * @author Aizar
 */
public class soal2 {

    public static void main(String[] args) {
        int bil;
        Scanner scan = new Scanner(System.in);
        System.out.println("MENENTUKAN BILANGAN GANJIL / GENAP");
        System.out.println("==================================");
        System.out.println("Inputkan Bilangan = ");
        bil = scan.nextInt();

        if (bil % 2 == 0) {
            System.out.println("\nBilangan " + bil + " adalah bilangan genap");
        } else {
            System.out.println("\nBilangan " + bil + " adalah bilangan ganjil");
        }
    }

}
