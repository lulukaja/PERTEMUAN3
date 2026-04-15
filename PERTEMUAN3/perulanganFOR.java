/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author LULUK
 */
import java.util.Scanner;

public class perulanganFOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mau mengulang berapa kali? ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Perulangan ke-" + i + ": Halo Mahasiswa!");
        }

        System.out.println("SELESAI!");
    }
}

