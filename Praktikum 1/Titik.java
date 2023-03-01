/*
Titik.java 22/03/2023
Penulis : Abida Akbar Rusyadin
Deskripsi : Kelas yang berisi 
*/


class Titik{

	double absis;
	double ordinat;
	static int counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	void setAbsis(double a){
		absis=a;
	}

	void setOrdinat(double o){
		ordinat=o;
	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	int getCounterTitik(){
		return counterTitik;
	}
}