package UTSA11202113844;

public class MahasiswaAktif extends Mahasiswa{

	public MahasiswaAktif(String nim, String nama, int semester, int usia, String[] krs) {
		super(nim, nama, semester, usia, krs);
		// TODO Auto-generated constructor stub
	}

	 	float hitungRataNilai(int[] nilai) {
	        return super.hitungRataNilai(nilai);
	    }

	    void infoMahasiswa() {
	       super.infoMahasiswa();
	    }

	    void infoKrsMahasiswa() {
	        super.infoKrsMahasiswa();
	    }
}
