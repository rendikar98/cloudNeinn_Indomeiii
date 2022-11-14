public class dataProduk {
    String kodeProduk, namaProduk;
    double hargaProduk;
    double bayar;
    int jumlahBeli;

    public String getKodeBuku() {
        return kodeProduk;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeProduk = kodeBuku;
    }

    public String getnamaProduk() {
        return namaProduk;
    }

    public void setnamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double gethargaProduk() {
        return hargaProduk;
    }

    public void sethargaProduk(float hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public double getBayar() {
        bayar = hargaProduk * jumlahBeli;
        return bayar;
    }

}
