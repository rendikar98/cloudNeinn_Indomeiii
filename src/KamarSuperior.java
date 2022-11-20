public class KamarSuperior extends Kamar {
    
    public KamarSuperior(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    public void setharga( int harga) {
        super.setHarga(harga);
    }

    public String getNama() {
        return super.getNama();
    }

    public int getUmur() {
        return super.getharga();
    }
}
