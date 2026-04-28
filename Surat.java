

public class Surat {
    private String idSurat;
    private String namaMahasiswa;
    private String kelas;
    private char jenisIzin; // S / I
    private int durasi;

    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    // Getter untuk Nama Mahasiswa
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void tampil() {
        System.out.println("ID Surat   : " + idSurat);
        System.out.println("Nama       : " + namaMahasiswa);
        System.out.println("Kelas      : " + kelas);
        System.out.println("Jenis Izin : " + jenisIzin);
        System.out.println("Durasi     : " + durasi + " hari");
        System.out.println("---------------------------");
    }
}