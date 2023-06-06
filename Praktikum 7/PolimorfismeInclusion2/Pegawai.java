/**
 * File : Pegawai.java
 * Penulis : Abida Akbar Rusyadin
 */

package PolimorfismeInclusion2;

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
    }
    
}