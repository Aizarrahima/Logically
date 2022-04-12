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
public class soal1 {

    public static void main(String[] args) {
        int bil1, bil2, bil3, maksimum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("MENENTUKAN BILANGAN YANG LEBIH BESAR");
        System.out.println("====================================");

        System.out.println("Inputkan Bilangan Pertama = ");
        bil1 = scan.nextInt();

        System.out.println("Inputkan Bilangan Kedua = ");
        bil2 = scan.nextInt();

        System.out.println("Inputkan Bilangan Ketiga = ");
        bil3 = scan.nextInt();

        if (bil1 > bil2 && bil1 > bil3) {
            maksimum = bil1;
        } else if (bil2 > bil3 && bil2 > bil3) {
            maksimum = bil2;
        } else if (bil3 > bil2 && bil3 > bil1) {
            maksimum = bil3;
        }
        System.out.println("\nBilangan Terbesar adalah " + maksimum);
    }
}
