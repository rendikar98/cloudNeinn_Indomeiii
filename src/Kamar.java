public abstract class Kamar {
    private double harga;
    
    public Kamar() {
        
    }

    public Kamar(double harga) {
        this.harga = harga;
    }

    public abstract void setHarga(double harga);

    public abstract double getharga();
    
    public abstract String getDeskripsi();

    public abstract int getKamarTersedia();

    public abstract void setKamarTersedia(int sisaKamar);
}
