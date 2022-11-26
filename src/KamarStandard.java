/**
 *Class KamarStandard merupakan class turunan dari class Kamar (class abstract)
 * dimana class ini me-Override method dari class kamar
 */
public class KamarStandard extends Kamar {
    //Inisialisasi variabel 
    private double harga;
    private String deskripsi;
    private int  kamarTersedia;

    /**
     * Method constructor untuk memberikan harga awal
     * pada kamar Standard
     */
    public KamarStandard(){
       this.harga = 400000;
    }

    /**
     * Method accessor untuk return harga kamar 
     */
    @Override
    public double getharga() {
        return this.harga;
    }

    /**
     * Method mutator dengan meng-set harga kamar dengan 
     * hargaBaru dengan menggunakan parameter hargaBaru
     * @param hargaBaru
     */
    @Override
    public void setHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    /**
     * Method accessor untuk return deskripsi dari kamar 
     */
    @Override
    public String getDeskripsi() {
       return deskripsi;
    }

    /**
     * Method accessor untuk return jumlah kamarTersedia 
     * pada hotel 
     */
    @Override 
    public int getKamarTersedia(){
        return kamarTersedia;
    }

    /**
     * Method mutator untuk set kamarTersedia dengan parameter
     * sisaKamar
     * @param sisaKamar
     */
    @Override 
    public void setKamarTersedia(int sisaKamar){
        this.kamarTersedia = sisaKamar;
    }

    
}

