/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pbo;

/**
 *
 * @author ASUS
 */
  import java.util.Scanner;
public class MainBuku {
  
public class mainBuku extends buku { // pewarisan buku kelas dari buku
    // memembuat objek input jadi static agar lebih mudah saat digunakan , classnya jadi tipe data referensi
    // yang memungkinkan untuk objek input dpt dipakai pada method lain pada class yg sama
    public static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {

        System.out.println("APLIKASI CONSOLE TOKO BUKU");
        System.out.println("=====================================");
        
        System.out.print("Masukkan jumlah data yang ingin di masukkan : ");
        int jumData = input.nextInt();

        String[] judulBuku = new String[jumData];
        String[] pengarang = new String[jumData];
        String[] penerbit = new String[jumData];
        int[] tahunCetak = new int[jumData];
        String[] kategori = new String[jumData];

        input.nextLine();
        for (int i = 0; i < jumData; i++) {
            System.out.println("\nData Buku ke-" + (i + 1));
            System.out.println("=====================================");
            System.out.print("Masukkan Judul Buku = ");
            judulBuku[i] = input.nextLine();
            System.out.print("Masukkan Pengarang Buku = ");
            pengarang[i] = input.nextLine();
            System.out.print("Masukkan Penerbit Buku = ");
            penerbit[i] = input.nextLine();
            System.out.print("Masukkan Tahun Cetak Buku = ");
            tahunCetak[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Kategori Buku (su/r/d/a) = ");
            kategori[i] = input.nextLine();
            switch (kategori[i]) {
                case "su":
                case "SU":
                    kategori[i] = "Semua  Umur";
                    break;
                case "r":
                case "R":
                    kategori[i] = "Remaja";
                    break;
                case "d":
                case "D":
                    kategori[i] = "Dewasa";
                    break;
                case "a":
                case "A":
                    kategori[i] = "Anak";
                    break;
                default:
                    break;
            }
        }
        setBuku(judulBuku, pengarang, penerbit, tahunCetak, kategori);
        lihatBuku(jumData);

    }

    private static void setBuku(String[] judulBuku, String[] pengarang, String[] Penerbit, int[] tahunCetak, String[] kategori) {
        setJudulBuku(judulBuku);
        setPengarang(pengarang);
        setPenerbit(Penerbit);
        setTahunCetak(tahunCetak);
        setKategori(kategori);
    }

    private static void lihatBuku(int JumData) {
        System.out.println("\n=====================================");
        System.out.println("Hasil Output :");
        System.out.println("=====================================");
        for (int i = 0; i < JumData; i++) {
            System.out.println("\nData Buku ke-" + (i + 1));
            System.out.println("=====================================");
            System.out.println("Judul Buku: " + getJudulBuku(i));
            System.out.println("Pengarang: " + getPengarang(i));
            System.out.println("Penerbit: " + getPenerbit(i));
            System.out.println("Tahun Cetak: " + getTahunCetak(i));
            System.out.println("Kategori: " + getKategori(i));
        }
    }
}
}
