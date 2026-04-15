/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author LULUK
 */
public class perulanganWHILE {
    public static void main(String[] args) {
        System.out.println("=== SISTEM HITUNG MUNDUR ===");
        
        int angka = 5;

        // Selama angka lebih besar dari 0, jalankan terus
        while (angka > 0) {
            System.out.println("Waktu tersisa: " + angka + " detik");
            angka--; // Kurangi angka 1 setiap putaran
        }

        System.out.println("WAKTU HABIS!");
    }
}
