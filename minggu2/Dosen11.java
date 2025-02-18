
import java.util.Calendar;
import java.util.Date;

public class Dosen11 {

    public Dosen11(){

    }
    public Dosen11(String idDsn, String nm,int thnBergabung, boolean stsAktif,  String bdgKeahlian){
        idDosen = idDsn;
        nama = nm;
        statusAktif = stsAktif;
        tahunBergabung = thnBergabung;
        bidangKeahlian = bdgKeahlian;
    }

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Date tgl = new Date();
    Calendar kalender = Calendar.getInstance();

    void tampilkanInformasi(){
        System.out.println("=======================");
        System.out.println("ID Dosen = " + idDosen);
        System.out.println("Nama Dosen = "+ nama);
        System.out.println("Status Aktif = "+ setStatusAktif(statusAktif));
        System.out.println("Tahun Bergabung = " + tahunBergabung);
        System.out.println("Bidang Keahlian = " +bidangKeahlian);
        
    }
    boolean setStatusAktif(boolean setStatus){
        if(statusAktif != setStatus){
            statusAktif = setStatus;
            System.out.println("Status dosen telah diubah!");
        }
        if(statusAktif == true){
            System.out.println("Dosen aktif");
        } else{
            System.out.println("Dosen tidak aktif");
        }
        return statusAktif;
    }
    int hitungMasaKerja(int thnSkrg){
        kalender.setTime(tgl);
        int tahun = kalender.get(Calendar.YEAR);
        int masaKerja = tahun - thnSkrg;
        System.out.println("Masa Kerja Dosen = " + masaKerja + " tahun");
        return masaKerja; 
    }
    String ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        return bidangKeahlian;
    }
}
