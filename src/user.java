import java.util.HashMap;

public class user {
    private String email;
    private String nama;
    private String password;
    private HashMap<String, makanan> makanan;
    private HashMap<String, minuman> minuman;

public user() {
    this.nama = null;
}

public user(String email, String password) {
    this.nama = "";
    this.email = email;
    this.password = password;
    this.makanan = new HashMap<>();
    this.minuman = new HashMap<>();
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

public int getJumlahMakanan() {
    return this.makanan.size();
}

public int getJumlahMinuman() {
    return this.minuman.size();
}

public java.util.Set<String> getKeyMinuman() {
    return this.minuman.keySet();
}

public java.util.Set<String> getKeyMakanan() {
    return this.makanan.keySet();
}

public Produk getProduk(String kode) {
    return this.Produk.get(kode);
}

public void addMakanan(String kode, makanan makanan) {
    this.makanan.put(kode, makanan);
}

public void addMinuman(String kode, minuman minuman) {
    this.minuman.put(kode, minuman);
}

public void removeMakanan(String kode) {
    this.makanan.remove(kode);
}

public void removeMinuman(String kode) {
    this.minuman.remove(kode);
}
}
