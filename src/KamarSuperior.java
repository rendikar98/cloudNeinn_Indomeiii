public class KamarSuperior extends Kamar {
    private int id;
    private String nama;
    private String harga;

    public KamarSuperior(){
        System.out.println("\n\nDeskripsi kamar ini:");
        Deskripsi();
    }

    @Override
    public void Deskripsi() {
        System.out.println("");
        
    }

    @Override
    public double getPrice() {
       return Double.parseDouble(this.harga);
    }

    @Override
    public void setPrice(String harga ) {
        this.harga = harga;
        
    }

    @Override
    public String getNamaKamar() {
        return this.nama;
    }

    @Override
    public void setNamaKamar(String namaKamar) {
        this.nama = namaKamar;   
    }
    
}
