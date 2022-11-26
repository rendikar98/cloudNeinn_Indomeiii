@Data  (
    author = "cloudNein",
    date = "26/11/2022",
    description = "Kelas kamar merupakan kelas abstract dan super class yang menyimpan variabel dan method dari kamar"
)
public abstract class Kamar {
    public Kamar() {
        
    }
    /**
     * method abstract untuk mengubah harga dari jenis kamar
     * @param harga
     */
    public abstract void setHarga(double harga);
    /**
     * method abstract untuk mengembalikan nilai dari harga kamar
     * @return
     */
    public abstract double getharga();
    
}
