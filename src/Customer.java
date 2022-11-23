 /**
  * Class customer untuk menyimpan data customer yang menginap di hotel 
  */
public class Customer {
    //Inisialisasi variabel 
    private String nama;
    private String id;
    private int lamaMenginap;

    /**
     * Method constructor dengan parameter
     * @param nama
     * @param id
     * @param lamaMenginap
     */
    public Customer(String nama, String id,int lamaMenginap){
        this.nama = nama;
        this.id = id;
        this.lamaMenginap = lamaMenginap;
    }

    /*
     * Method accessor untuk return nama customer
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method mutator untuk set nama customer dengan parameter nama 
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method accessor yang akan mengembalikan id 
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * Method mutator untuk set id dengan parameter id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Method accessor untuk return lamaMenginap customer 
     * @return
     */
    public int getLamaMenginap() {
        return this.lamaMenginap;
    }
    
    /**
     * Method mutator akan set lamaMenginap customer dengan parameter lamaMenginap 
     * @param lamaMenginap
     */
    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

}
