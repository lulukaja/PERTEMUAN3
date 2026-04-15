/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author LULUK
 */
public class perulanganDOWHILE {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI TARIK TUNAI ===");
        
        int saldo = 10000;
        int biayaTarik = 4000;

        do {
            System.out.println("Berhasil menarik Rp" + biayaTarik);
            saldo = saldo - biayaTarik; // Kurangi saldo
            System.out.println("Sisa saldo sekarang: Rp" + saldo);
            System.out.println("----------------------------");
            
            // Cek di akhir: Apakah saldo masih cukup untuk tarik lagi?
        } while (saldo >= biayaTarik);

        System.out.println("Selesai. Saldo Anda tidak cukup untuk penarikan lagi.");
    }
}
