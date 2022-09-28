package praktikum6ara;

public class Mahasiswa {       
    public String nama;
    public String npm;
    private double nilaiUas;
    private double nilaiUts;
    
    public void insertNilaiUas(double nilai){
        nilaiUas = nilai;
    }
    public void insertNilaiUts(double nilai){
        nilaiUts = nilai;
      }
    public void dataMhs(){
        System.out.println("nama       :" + nama);
        System.out.println("npm        :" + npm);
        System.out.println("Nilai UAS  :" + nilaiUas);
        System.out.println("Nilai UTS  :" + nilaiUts);
        System.out.println("Nilai akhir:" + nilaiAkhir());
    } 
    public double nilaiAkhir(){
        double jumlah = nilaiUts + nilaiUas;
        return jumlah/2;
    }
}
