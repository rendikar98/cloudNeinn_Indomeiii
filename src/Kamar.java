
/**
 * Class kamar merupakan class abstract yang akan di override oleh subclass-nya
 */
public abstract class Kamar {
    //Inisilaisasi variabel 
    private double harga;
    
    /**
     * Method constructor yang dikosongkan 
     */
    public Kamar() {
        
    }

    /**
     * Method constructor dengan parameter harga yang akan mengembalikan harga kamar
     * @param harga
     */
    public Kamar(double harga) {
        this.harga = harga;
    }

    /**
     * Method abstract yang akan di override pada subclass dari superclass kamar
     */

    public abstract void setHarga(double harga);

    public abstract double getharga();
    
    public abstract String getDeskripsi();

    public abstract int getKamarTersedia();

    public abstract void setKamarTersedia(int sisaKamar);
}

