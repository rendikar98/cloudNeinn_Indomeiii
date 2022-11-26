package classes;
public class Customer{

    private String nama;
    private String id;
    private int lamaMenginap;

    public Customer(String nama, String id,int lamaMenginap){
        this.nama = nama;
        this.id = id;
        this.lamaMenginap = lamaMenginap;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLamaMenginap() {
        return this.lamaMenginap;
    }
    
    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    public void addkamarStandard() {
        KamarStandard ks = new KamarStandard();
    }

    public void addkamarSuperior() {
        KamarSuperior ksu = new KamarSuperior();
    }

    public void addkamarDeluxe() {
        KamarStandard kd = new KamarStandard();
    }
}