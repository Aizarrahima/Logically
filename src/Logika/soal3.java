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
public class soal3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bil;
        int i = 0;
        int jumlah = 0;

        System.out.println("MENGHITUNG PENJUMLAHAN DARI ANGKA 1-N");
        System.out.println("=====================================");
        System.out.println("Inputkan Bilangan = ");
        bil = scan.nextInt();

        while (i <= bil) {
            jumlah = jumlah + i;
            i++;
        }
        System.out.println("=========> " + jumlah);
    }
}
