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
public class soal8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, index, jumlah[], max;
        String buah[], buahMax = null;

        System.out.println("Penjualan Buah");
        System.out.println("==============");
        System.out.println("Masukkan jumlah Buah = ");
        index = scan.nextInt();
        jumlah = new int[index];
        buah = new String[index];

        System.out.println("Masukkan " + index + " buah");
        for (i = 0; i < index; i++) {
            System.out.print("buah ke-" + (i) + " : ");
            buah[i] = scan.next();

            System.out.print("Jumlah : ");
            jumlah[i] = scan.nextInt();

            System.out.println(" ");
        }

        System.out.println("Data Buah");

        max = jumlah[0];
        buahMax = buah[0];
        for (i = 0; i < index; i++) {
            System.out.println(buah[i] + " = " + jumlah[i] + "\n");
            if (jumlah[i] > max) {
                buahMax = buah[i];
            }
        }
        System.out.println("Buah terbanyak = " + buahMax);
    }
}
