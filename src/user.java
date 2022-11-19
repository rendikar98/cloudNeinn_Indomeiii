package classes;
import java.util.HashMap;

public class User {
    private String email;
    private String nama;
    private String password;
    private HashMap<String, Kamar> kamar;

    public User(){
        this.nama = "Guest";
    }

    public User(String email, String password){
        this.nama = "";
        this.password = password;
        this.email = email;
        this.kamar = new HashMap<>();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getJumlahBuku() {
        return this.kamar.size();
    }
    
    public java.util.Set<String> getKeyBuku() {
        return this.kamar.keySet();
    }

    public Kamar getBuku(String kode) {
        return this.kamar.get(kode);
    }
    
    public void addBuku(String id, Kamar kamar) {
        this.kamar.put(id, kamar);
    }
    
    public void removeBuku(String kode) {
        this.kamar.remove(kode);
    }
}
