/**
 * MKubus.java
 * Penulias : Abida Akbar Rusyadin
 * Tanggal : 17/03/2023
 * Deskripsi : Main Kubus
 */

// Dependensi
// class MKubus menggunakan class BujurSangkar dan Class Kubus
// Class MKubus bergantung

// menghitung volume dan luas alas kubus dengan panjang sisi 4 satuan
//ditulis pada kertas + notasi nya\bukan kode

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus {
	public static void main(String[] args) {
		BujurSangkar persegiKu = new BujurSangkar(4);
		Kubus kubusKu = new Kubus(persegiKu);

		System.out.println("Volume Kubus dengan sisi 4 satuan adalah " + (int)kubusKu.hitungVolume() + " satuan volume.");
		System.out.println("Luas Alas Kubus dengan sisi 4 satuan adalah " + (int)kubusKu.hitungLuasAlas() + " satuan luas.");
	}
}