package classes;

@Data  (
    author = "cloudNein",
    date = "26/11/2022",
    description = "Kelas kamarStandard merupakan kelas yang menyimpan variabel dan method dari kamarstandard"
)
public class KamarStandard extends Kamar {
    private double harga;
    
    /**
     * method constructor dari kelas kamarstandard yang berisi variabel harga dengan nilai 400000
     */
    public KamarStandard(){
        this.harga = 400000;
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
