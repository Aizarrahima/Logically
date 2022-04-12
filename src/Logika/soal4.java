/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aizar
 */
public class soal4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, jumlah, bil[];

        System.out.println("MENENTUKAN NILAI MAKSIMUM DARI BILANGAN 2");
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah index = ");
        jumlah = scan.nextInt();
        bil = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " index");
        for (i = 0; i < jumlah; i++) {
            System.out.print("index ke-" + (i) + " : ");
            bil[i] = scan.nextInt();
        }

        String arr = Arrays.toString(bil);
        System.out.println("\nElemen-elemen Array yang dimasukkan: " + arr);

        System.out.print("Bilangan Genap: ");
        for (i = 0; i < jumlah; i++) {
            if (bil[i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Bilangan Ganjil: ");
        for (i = 0; i < jumlah; i++) {
            if (bil[i] % 2 == 1) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println(" ");
    }
}
