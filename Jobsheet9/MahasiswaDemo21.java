package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();

                    System.out.print("NIM: ");
                    String nim = scan.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa21 mhs = new Mahasiswa21(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas berhasil dikumpulkan!");
                    break;

                case 2:
                    Mahasiswa21 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas: " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();

                        dinilai.tugasDinilai(nilai);
                        System.out.println("Nilai " + dinilai.nama + " = " + nilai);
                    }
                    break;

                case 3:
                    Mahasiswa21 topData = stack.peek();
                    if (topData != null) {
                        System.out.println("Tugas teratas: " + topData.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar Tugas:");
                    System.out.println("Nama\tNIM\tKelas\tNilai");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa21 bawah = stack.bottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama oleh: " + bawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas saat ini: " + stack.jumlahTugas());
                    break;
                case 0:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        scan.close();
    }
}