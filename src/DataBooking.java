public class DataBooking {
    
    String idKamar;
    String namaKamar;
    double hargaKamar;
    int jumlahKamar;
    double bayar;

    public String getIdKamar(){
        return idKamar;
    }

    public void setIdKamar(String idKamar){
        this.idKamar = idKamar;
    }

    public String getNamaKamar(){
        return namaKamar;
    }

    public void setNamaKamar(String namaKamar){
        this.namaKamar = namaKamar;
    }

    public double getHargaKamar(){
        return hargaKamar;
    }

    public void setHargaKamar(double hargaKamar){
        this.hargaKamar = hargaKamar;
    }
    
    public int getJumlahKamar(){
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar){
        this.jumlahKamar = jumlahKamar;
    }

    public double getBayar(){
        bayar = hargaKamar * jumlahKamar;
        return bayar;
    }
}
