package src;

@Data  (
    author = "cloudNein",
    date = "26/11/2022",
    description = "Kelas kamarSuperior merupakan kelas yang menyimpan variabel dan method dari kamaarSuperior"
)
public class KamarSuperior extends Kamar {

    private double harga;

    /**
     * method constructor dari kelas kamarsuperior yang berisi variabel harga dengan nilai 600000
     */
    public KamarDeluxe(){
        this.harga = 600000;
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
