/**
 * BujurSangkar.java
 * Penulias : Abida Akbar Rusyadin
 * Tanggal : 17/03/2023
 * Deskripsi : Kelas BujurSangkar
 */

// sub class dari poligon
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double panjangSisi;

	// constructor
	public BujurSangkar(double panjangSisi) {
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}

	public double hitungLuas() {
		return panjangSisi * panjangSisi;
	}

	public double getPanjangSisi() {
		return this.panjangSisi;
	}
}