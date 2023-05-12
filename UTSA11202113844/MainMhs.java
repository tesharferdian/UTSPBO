package UTSA11202113844;


import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;


public class MainMhs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("== Pilih jenis mahasiswa: ==");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Mahasiswa Baru");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("4. Mahasiswa Transfer");
            System.out.println("5. Mahasiswa Aktif");
            System.out.println("6. Keluar");

            pilihan = scanner.nextLine();

            switch (pilihan) {
	            case "1":
	                System.out.println("Input data mahasiswa:");
	                System.out.print("NIM: ");
	                String nim = scanner.nextLine();
	                System.out.print("Nama: ");
	                String nama = scanner.nextLine();
	                System.out.print("Semester: ");
	                int semester = scanner.nextInt();
	                scanner.nextLine();
	                System.out.print("Usia: ");
	                int usia = scanner.nextInt();
	                scanner.nextLine();
	                System.out.println("Input KRS (pisahkan dengan koma):");
	                String[] krs = scanner.nextLine().split(",");
	                Mahasiswa mhs = new Mahasiswa(nim, nama, semester, usia, krs);
	                mhs.infoMahasiswa();
	                mhs.infoKrsMahasiswa();
	                int nilai[] = {75, 73, 94};
	                System.out.println("Mahasiswa " + mhs.nama + ", rata-rata nilai: " + mhs.hitungRataNilai(nilai));
	                //System.out.println("Ikut OSPEK: " + mhsBaru.ikutOspek());
	                break;
	                
                case "2":
                    System.out.println("Input data mahasiswa baru:");
                    System.out.print("NIM: ");
                    String nim1 = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama1 = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Usia: ");
                    int usia1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Asal Sekolah: ");
                    String asalSekolah = scanner.nextLine();
                    System.out.println("Input KRS (pisahkan dengan koma):");
                    String[] krsBaru = scanner.nextLine().split(",");
                    MahasiswaBaru mhsBaru = new MahasiswaBaru(nim1, nama1, semester1, usia1, krsBaru, asalSekolah);
                    mhsBaru.infoMahasiswa();
                    mhsBaru.infoKrsMahasiswa();
                    int nilaiBaru[] = {76, 80, 90};
                    System.out.println("Mahasiswa " + mhsBaru.nama + ", rata-rata nilai: " + mhsBaru.hitungRataNilai(nilaiBaru));
                    System.out.println("Ikut OSPEK: " + mhsBaru.ikutOspek());
                    break;
                    
                case "3":
                    System.out.println("Input data mahasiswa lulus:");
                    System.out.print("NIM: ");
                    nim1 = scanner.nextLine();
                    System.out.print("Nama: ");
                    nama1 = scanner.nextLine();
                    System.out.print("Semester: ");
                    semester1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Usia: ");
                    usia1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tahun Wisuda: ");
                    int tahunWisuda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("IPK: ");
                    float ipk = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Input KRS (pisahkan dengan koma):");
                    String[] krsLulus = scanner.nextLine().split(",");
                    MahasiswaLulus mhsLulus = new MahasiswaLulus(nim1, nama1, semester1, usia1, krsLulus, tahunWisuda, ipk);
                    mhsLulus.infoMahasiswa();
                    mhsLulus.infoKrsMahasiswa();
                    int nilaiLulus[] = {72, 70, 90};
                    System.out.println("Mahasiswa " + mhsLulus.nama + ", rata-rata nilai: " + mhsLulus.hitungRataNilai(nilaiLulus));
                    System.out.println("Ikut WISUDA: " + mhsLulus.ikutWisuda());
                    break;
                    
                case "4":
                	 System.out.println("Input data mahasiswa Transfer:");
                     System.out.print("NIM: ");
                     String nim2 = scanner.nextLine();
                     System.out.print("Nama: ");
                     String nama2 = scanner.nextLine();
                     System.out.print("Semester: ");
                     int semester2 = scanner.nextInt();
                     scanner.nextLine();
                     System.out.print("Usia: ");
                     int usia2 = scanner.nextInt();
                     scanner.nextLine();
                     System.out.print("Asal Sekolah: ");
                     String asalSekolah2 = scanner.nextLine();
                     System.out.print("Asal Universitas: ");
                     String asalUniversitas = scanner.nextLine();
                     System.out.println("Input KRS (pisahkan dengan koma):");
                     String[] krsTrans = scanner.nextLine().split(",");
                     MahasiswaTransfer mhsTrans = new MahasiswaTransfer(nim2, nama2, semester2, usia2, krsTrans, asalSekolah2, asalUniversitas);
                     mhsTrans.infoMahasiswa();
                     mhsTrans.infoKrsMahasiswa();
                     int nilaiTrans[] = {76, 80, 90};
                     System.out.println("Mahasiswa " + mhsTrans.nama + ", rata-rata nilai: " + mhsTrans.hitungRataNilai(nilaiTrans));
                     System.out.println("Ikut OSPEK: " + mhsTrans.ikutOspek());
                     break;
                case "5":
                	 System.out.println("Input data mahasiswa Aktif:");
 	                 System.out.print("NIM: ");
 	                 String nim3 = scanner.nextLine();
 	                 System.out.print("Nama: ");
 	                 String nama3 = scanner.nextLine();
 	                 System.out.print("Semester: ");
 	                 int semester3 = scanner.nextInt();
 	                 scanner.nextLine();
 	                 System.out.print("Usia: ");
 	                 int usia3 = scanner.nextInt(); 
 	                 scanner.nextLine();
 	                 System.out.println("Input KRS (pisahkan dengan koma):");
 	                 String[] krsAktif = scanner.nextLine().split(",");
 	                 Mahasiswa mhsAktif = new Mahasiswa(nim3, nama3, semester3, usia3, krsAktif);
 	                 mhsAktif.infoMahasiswa();
 	                 mhsAktif.infoKrsMahasiswa();
 	                 int nilaiAktif[] = {75, 75, 95};
 	                 System.out.println("Mahasiswa " + mhsAktif.nama + ", rata-rata nilai: " + mhsAktif.hitungRataNilai(nilaiAktif));
 	                 //System.out.println("Ikut OSPEK: " + mhsBaru.ikutOspek());
 	                 break;
                case "6":
                	System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan pilih lagi.");
                    break;
            }

            System.out.println();

        } while (!pilihan.equals("6"));

        scanner.close();
    }
}
