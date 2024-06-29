/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pbo;

/**
 *
 * @author ASUS
 */
public class buku {
   //atribut
    static String [] judulBuku;
    private static String [] pengarang;
    private static String [] Penerbit;
    private static int [] tahunCetak;
    private static String [] kategori;

    public static String getJudulBuku(int i) {  // get untuk mendapatkan , static agar tidak buat objek baru lagi 
                                                //int i mendapatkan index via parameter
        return judulBuku[i];   // mengembalikan nilai judulBuku[i] ke tempat panggilnya di panggil di kelas mainnya 
                                //yang looping lihatBuku
    }

    public static void setJudulBuku(String[] judulBuku) { // set untuk mengatur 
        buku.judulBuku = judulBuku; // memanggil via class // class buku , attribut judulBuku = judulBuku di parameter
    }

    public static String getPengarang(int i) {
        return pengarang[i];
    }

    public static void setPengarang(String[] pengarang) {
        buku.pengarang = pengarang;
    }

    public static String getPenerbit(int i) {
        return Penerbit[i];
    }

    public static void setPenerbit(String[] Penerbit) {
        buku.Penerbit = Penerbit;
    }

    public static int getTahunCetak(int i) {
        return tahunCetak[i];
    }

    public static void setTahunCetak(int[] tahunCetak) {
        buku.tahunCetak = tahunCetak;
    }

    public static String getKategori(int i) {
        return kategori[i];
    }

    public static void setKategori(String[] kategori) {
        buku.kategori = kategori;
    }
       
}