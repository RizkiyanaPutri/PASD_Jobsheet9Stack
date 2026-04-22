package Jobsheet9;

public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa21() {
        this.nilai = -1;
    }

    public Mahasiswa21(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}