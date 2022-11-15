public class makanan extends Produk {
    public makanan (){

    }
    public makanan(String data){
        try{
            String Data[] = new String[10];
            int i = 0;
            StringTokenizer sToken = new StringTokenizer(data, ",");

            while(sToken.hasMoreTokens()){
                Data[i++] = sToken.nextToken();
            }

            Data[0] = super.getKode() ;
            Data[1] = super.getNama();
            Data[2] = super.getHarga();
        } catch (Exception e){

        }
    }
    @java.lang.Override
    public double getHarga() {
        return Double.parseDouble(super.getHarga());
    }

    @java.lang.Override
    public String getKode() {
        return super.getKode();
    }

    @java.lang.Override
    public String getNama() {
        return super.getNama();
    }

    @java.lang.Override
    public void setHarga(String harga) {
        super.setHarga(harga);
    }

    @java.lang.Override
    public void setKode(String kode) {
        super.setKode(kode);
    }

    @java.lang.Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
}
