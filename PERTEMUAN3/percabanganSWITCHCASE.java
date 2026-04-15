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

public class percabanganSWITCHCASE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== PROGRAM MENU KANTIN ===");

        do {
            System.out.println("1. NASI GORENG");
            System.out.println("2. MIE AYAM");
            System.out.println("3. ES TEH");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> System.out.println("Hasil: Kamu memilih Nasi Goreng.");
                case 2 -> System.out.println("Hasil: Kamu memilih Mie Ayam.");
                case 3 -> System.out.println("Hasil: Kamu memilih Es Teh.");
                default -> // Jika menekan 4 atau angka salah lainnya
                    System.out.println("MENU TIDAK TERSEDIA!.");
            }

            // Mengulang jika angka yang dimasukkan salah (bukan 1, 2, atau 3)
        } while (pilihan < 1 || pilihan > 3);

        System.out.println("PESANAN BERHASIL, TERIMA KASIH!");
    }
}