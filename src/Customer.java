package src;

@Data  (
    author = "cloudNein",
    date = "26/11/2022",
    description = "Kelas customer merupakan kelas yang menyimpan variabel dan method dari customer"
)
public class Customer{

    private String nama;
    private String id;
    private double lamaMenginap;

    public Customer(String nama, String id,double lamaMenginap){
        this.nama = nama;
        this.id = id;
        this.lamaMenginap = lamaMenginap;
    }
    /**
     * method untuk mengembalikan nama dari customer
     * @return nama yang merupakan variabel yang menyimpan nama customer
     */
    public String getNama() {
        return this.nama;
    }
    /**
     * method untuk mengubah nama dari customer
     * @param nama customer
     */
    public void setNama(String namaBaru) {
        this.nama = nama;
    }
    /**
     * method untuk mengembalikan id dari customer
     * @return id
     */
    public String getId() {
        return this.id;
    }
    /**
     * method untuk mengubha id customer
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * method untuk mengembalikan berapa lama hari menginap dari customer
     * @return lamamenginap
     */
    public double getLamaMenginap() {
        return this.lamaMenginap;
    }
    /**
     * method untuk mengubah hari nginap dari customer
     * @param lamaMenginap
     */
    public void setLamaMenginap(double lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

}
