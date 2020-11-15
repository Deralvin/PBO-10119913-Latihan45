/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan45;

import java.util.Scanner;

/**
 * @author Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10-K
 * NIM :10119913 
 */
public class Pbo10119913latihan45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String nama;
        int jumlah;
        Printer cetak = new Printer();
        Scanner scanner = new Scanner(System.in);

        //proses pengisian data
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda\t\t\t: ");
        cetak.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        cetak.setJmlCetak(scanner.nextInt());

        //proses pemanggilan method
        nama = cetak.getNama();
        jumlah = cetak.getJmlCetak();
        cetak.cetak(nama);
        cetak.cetak(jumlah,nama);
    }
    
}
