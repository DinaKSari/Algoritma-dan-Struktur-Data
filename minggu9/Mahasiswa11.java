public class Mahasiswa11{
    String nama, nim, kelas;
    int nilai;

    Mahasiswa11(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasNilai(int nilai){
        this.nilai = nilai;
    }
}