package classes;

@Data  (
    author = "cloudNein",
    date = "26/11/2022",
    description = "Kelas kamarDeluxe merupakan kelas yang menyimpan variabel dan method dari kamarDeluxe"
)
public class KamarDeluxe extends Kamar {
    private double harga;
    /**
     * method constructor dari kelas kamardeluxe yang berisi variabel harga dengan nilai 800000
     */
    public KamarDeluxe(){
       this.harga = 800000;
    }
    /**
     * method yang di override dari superclass kamar untuk mengembalikan harga dari kamar
     * @return
     */
    @Override
    public double getharga() {
        return this.harga;
    }
    /**
     * method yang di override dari superclass kamar untuk mengubah harga dari kamr 
     */
    @Override
    public void setHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

}
