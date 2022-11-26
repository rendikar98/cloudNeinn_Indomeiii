public class KamarSuperior extends Kamar {

    private double harga = 600000;

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
}
