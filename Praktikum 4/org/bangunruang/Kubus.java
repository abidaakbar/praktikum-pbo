/**
 * Kubus.java
 * Penulias : Abida Akbar Rusyadin
 * Tanggal : 17/03/2023
 * Deskripsi : Kelas Kubus
 */
// agregasi dari BujurSangkar (Class Kubus memiliki BujurSangkar)
//kelas bujur sangkar harus ada agar class kubus dapat berjalan

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar p;

	// constructor
	public Kubus(BujurSangkar p) {
		this.p = p;
	}

	public double hitungVolume() {
		double panjangSisi = p.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}

	public double hitungLuasAlas() {
		double panjangSisi = p.getPanjangSisi(); // duplicate code
		return panjangSisi * panjangSisi;
	}
}