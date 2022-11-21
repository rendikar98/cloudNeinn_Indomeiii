public class User {
    private String nama;
    private int umur;

    public User(){

    }

    public User(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getUmur(){
        return this.umur;
    }

    public String getNama(){
        return this.nama;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
