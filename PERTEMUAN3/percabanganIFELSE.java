/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author LULUK
 */
import java.util.Scanner; // WAJIB PALING ATAS

public class percabanganIFELSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM CEK KELULUSAN ===");
        System.out.print("Masukkan nilai ujian kamu: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Hasil: SELAMAT, KAMU LULUS!");
        } else {
            System.out.println("Hasil: MAAF, KAMU REMEDIAL.");
        }
    }
}