import java.util.StringTokenizer;

public class Produk{
    private String kode;
    private String nama;
    private String harga;


    public Produk(){

    }

    public Produk(String data){
        try{
            String Data[] = new String[10];
            int i = 0;
            StringTokenizer sToken = new StringTokenizer(data, ",");

            while(sToken.hasMoreTokens()){
                Data[i++] = sToken.nextToken();
            }

            this.kode = Data[0];
            this.nama = Data[1];
            this.harga = Data[2];
        } catch (Exception e){

        }
    }

    public String getKode(){
        return this.kode;
    }

    public String getNama(){
        return this.nama;
    }

    public double getHarga(){
        return Double.parseDouble(this.harga);
    }

}