package classes;
import java.util.StringTokenizer;

public class Kamar {
    private String id;
    private String nama;
    private String harga;
    private String kategori;
    private String dir;
    private String desc;

    public Kamar (){

    }

    public Kamar(String data) {
        try{
            String Data[] = new String[10];
            int i = 0;
            StringTokenizer sToken = new StringTokenizer(data, ",");

            while (sToken.hasMoreTokens()) {
                Data[i++] = sToken.nextToken();
            }
            this.id = Data[0];
            this.nama = Data[1];
            this.harga = Data[2];
            this.kategori = Data[3];
            this.dir = Data[4];
            this.desc = Data[5];
        }catch ( Exception e) {

        }
    }

    public String getDeskripsi() {
        return this.desc; 
    }

    public double getharga() {
       return Double.parseDouble(this.harga);
    }

    public String getNama() {
        return this.nama;
    }

    public String getDir() {
        return this.dir;
    }

    public String getkategori() {
        return this.kategori;
    }

    public String getId() {
        return this.id;
    }
    
}
