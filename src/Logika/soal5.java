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
public class soal5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maksimum, jumlah, i, array[];
        int lokasi = 1;

        System.out.println("Menentukan Nilai Maksimum 2");
        System.out.println("===========================");
        System.out.print("Masukkan jumlah elemen : ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " angka");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        maksimum = array[0];
        for (i = 0; i < jumlah; i++) {
            if (array[i] > maksimum) {
                maksimum = array[i];
                lokasi = i + 1;
            }
        }

        String arr = Arrays.toString(array);
        System.out.println("\nElemen-elemen array yang dimasukkan : " + arr);
        System.out.println("Bilangan maksimum adalah " + maksimum + " berada di elemen ke-" + lokasi);
    }
}
