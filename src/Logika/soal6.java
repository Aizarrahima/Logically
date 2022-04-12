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
public class soal6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, x, y, index, array[];
        int hasil = 0;

        String keterangan = "Tidak Bisa";
        System.out.println("Menentukan Kemungkinan");
        System.out.println("======================");

        System.out.print("Inputkan nilai k = ");
        k = input.nextInt();

        System.out.print("Inputkan jumlah index = ");
        index = input.nextInt();
        array = new int[index];

        System.out.println("\nMasukkan " + index + " angka");
        for (x = 0; x < index; x++) {
            System.out.print("Index ke-" + x + " : ");
            array[x] = input.nextInt();
        }

        for (x = 0; x < index; x++) {
            for (y = 0; y < index; y++) {
                if (array[x] != array[y]) {
                    if (array[x] + array[y] == k) {
                        hasil++;
                    }
                }
            }
        }

        if (hasil > 0) {
            keterangan = "Bisa";
        }

        String arrValue = Arrays.toString(array);
        System.out.println("\nArray yang dimasukkan adalah " + arrValue);
        System.out.println("Apakah mungkin? " + keterangan);
        if (hasil > 0) {
            System.out.println("Jumlah kemungkinan = " + hasil);
        }
    }
}
