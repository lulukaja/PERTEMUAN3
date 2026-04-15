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

public class larikSATUDIMENSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Contoh: Tabel Nilai 2 Mahasiswa x 2 Mata Kuliah
        // [baris][kolom]
        int[][] tabelNilai = new int[2][2];

        System.out.println("=== INPUT DATA TABEL NILAI (2x2) ===");
        
        // Perulangan untuk BARIS
        for (int baris = 0; baris < 2; baris++) {
            // Perulangan untuk KOLOM
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print("Nilai Mahasiswa ke-" + (baris+1) + " MK ke-" + (kolom+1) + ": ");
                tabelNilai[baris][kolom] = input.nextInt();
            }
        }

        // Menampilkan hasil dalam bentuk tabel
        System.out.println("\n=== TAMPILAN MATRIKS NILAI ===");
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print(tabelNilai[baris][kolom] + "  ");
            }
            System.out.println(); // Pindah baris baru setelah kolom habis
        }
    }
}