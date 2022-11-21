public class KamarStandard extends Kamar {
    
    public KamarStandard(String nama, int harga) {
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

    public int getHarga() {
        return super.getharga();
    }
}
