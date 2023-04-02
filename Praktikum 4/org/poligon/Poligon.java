/**
 * Poligon.java
 * Penulias : Abida Akbar Rusyadin
 * Tanggal : 17/03/2023
 * Deskripsi : Kelas Poligon
 */
// super class poligon
package org.poligon;

public class Poligon {
	protected int jumlahSisi;

	// constructor
	public Poligon() {
		this.jumlahSisi = 0;
	}

	public void setJumlahSisi(int jumlahSisi) {
		this.jumlahSisi = jumlahSisi;
	}

	public int getJumlahSisi() {
		return this.jumlahSisi;
	}
}