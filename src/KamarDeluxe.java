public class KamarDeluxe extends Kamar {
    private double harga;

    public KamarDeluxe(){
       
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
