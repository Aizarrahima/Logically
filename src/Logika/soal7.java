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
public class soal7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, index, array[];
        int hasil = 0;
        String keterangan = "Tidak Ada";

        System.out.println("Mengecek Nilai");
        System.out.println("==============");

        System.out.print("Inputkan jumlah index = ");
        index = scan.nextInt();
        array = new int[index];

        System.out.println("\nMasukkan " + index + " angka");
        for (x = 0; x < index; x++) {
            System.out.print("Index ke-" + x + " : ");
            array[x] = scan.nextInt();
        }

        for (x = 0; x < index; x++) {
            for (y = x + 1; y < index; y++) {
                if (array[x] == array[y]) {
                    hasil++;
                }
            }
        }

        if (hasil > 0) {
            keterangan = "Ada";
        }

        String arrValue = Arrays.toString(array);
        System.out.println("\nArray yang dimasukkan adalah " + arrValue);
        System.out.println("Apakah ada perbedaan? " + keterangan);
    }
}
