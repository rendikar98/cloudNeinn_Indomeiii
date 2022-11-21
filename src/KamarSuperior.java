public class KamarSuperior extends Kamar {

    private double harga;
    private String deskripsi;
    private int  kamarTersedia;

    public KamarSuperior(){
       
    }

    @Override
    public double getharga() {
        return harga;
    }

    @Override
    public void setHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    @Override
    public String getDeskripsi() {
       return deskripsi;
    }

    @Override 
    public int getKamarTersedia(){
        return kamarTersedia;
    }

    @Override 
    public void setKamarTersedia(int sisaKamar){
        this.kamarTersedia = sisaKamar;
    }
}
