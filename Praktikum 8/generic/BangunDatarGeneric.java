/**
* File : BangunDatarGeneric.java
* Penulis : Abida Akbar Rusyadin
* Deskripsi : kelas konstruksi generic untuk bangun datar
*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T get() {
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
//dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan ! 

//Apabila kita mengganti T dalam kelas BangunDatarGeneric.java dengan karakter lain seperti T1, T2, atau T1234, 
//hal ini berarti kita sedang mengubah nama parameter tipe generik yang digunakan dalam kelas tersebut.

//Perubahan ini tidak akan mempengaruhi fungsi keseluruhan kode. 
//Karakter yang digunakan sebagai nama parameter tipe generik tidak memiliki arti khusus 
//dan dapat digantikan dengan karakter atau kata apa pun yang valid dalam bahasa Java.

//Misalnya, jika kita mengubah T menjadi T1 dalam BangunDatarGeneric.java, 
//maka perubahan tersebut akan mencakup penggantian semua kemunculan T dengan T1 di seluruh kelas BangunDatarGeneric.