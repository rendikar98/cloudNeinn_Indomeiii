public class Kamar {
    
    private String nama;
    private int harga;

    public Kamar(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama( String nama) {
        this.nama = nama;
    }

    public void setHarga( int harga) {
        this.harga = harga;
    }

    public int getharga(){
        return this.harga;
    }

    public String getNama() {
        return this.nama;
    }
}
