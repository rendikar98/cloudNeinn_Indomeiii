public abstract class Kamar {
    
    private String nama;
    private double harga;
    
    public Kamar() {
        
    }

    public Kamar(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void setNama( String nama);

    public abstract void setHarga( double harga);

    public abstract double getharga();

    public abstract String getNama();
    
    public abstract String getDeskripsi();
}
