/**
 * MOperasiTitik.java 01/03/2023
 * Penulis : Abida Akbar Rusyadin
 * Deskripsi : Kelas MOperasiTitik
 */

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1 = new Titik(5.0, 3.0);
		Titik t2 = new Titik(5.0, 3.0);
		OperasiTitik op = new OperasiTitik();

		System.out.println("Titik("+ t1.getAbsis() +", "+ t1.getOrdinat() +")");

		//op.refleksiSumbuX(t1);
		//System.out.println("\nTitik setelah refleksi sumbu Y");
		// System.out.println("Titik("+ t1.getAbsis() +", "+ t1.getOrdinat() +")");

		// Tugas
		Titik hasilRefleksiY = op.refleksiY(t1);
		System.out.println("\nTitik setelah refleksi sumbu Y");
		System.out.println("Titik("+ hasilRefleksiY.getAbsis() +", "+ hasilRefleksiY.getOrdinat() +")");
		
		Titik hasilRefleksiX = op.refleksiX(t2);
		System.out.println("\nTitik setelah refleksi sumbu X");
		System.out.println("Titik("+ hasilRefleksiX.getAbsis() +", "+ hasilRefleksiX.getOrdinat() +")");
	}	
}