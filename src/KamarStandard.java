public class KamarStandard extends Kamar {
    private double harga = 200000;

    public KamarStandard(){
       
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
