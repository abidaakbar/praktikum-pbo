/**
* Titik.java 22/02/2023
* Penulis : Abida Akbar Rusyadin
* Deskripsi : Kelas Titik
*/

class Titik{

	private double absis;
	private double ordinat;
	static int counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}

	public void setAbsis(double a){
		absis=a;
	}

	public void setOrdinat(double o){
		ordinat=o;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik(){
		return counterTitik;
	}
}