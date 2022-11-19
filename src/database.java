package database;

import java.io.*;
import java.util.StringTokenizer;

import classes.Kamar;
import classes.User;

public class database {
    private static String[] data = new String[1000];
    static StringTokenizer stringToken;
    private final String fileRegistrasi;
    private final String fileKamar;
    private final String fileRecordPemesanan;

    public database() {
        this.fileRecordPemesanan = "src/main/java/database/RecordPemesanan.txt";
        this.fileKamar = "src/main/java/database/Data_Kamar.txt";
        this.fileRegistrasi = "src/main/java/database/registrasi.txt";
    }

    public String[] cekDataUser(String email, String password) throws IOException {
        try (FileReader fileinput = new FileReader(fileRegistrasi);
                BufferedReader bufferedReader = new BufferedReader(fileinput);) {
            String Data;
            bufferedReader.mark(500);
            bufferedReader.reset();

            while (!(Data = bufferedReader.readLine()).isEmpty()) {
                int i = 0;
                stringToken = new StringTokenizer(Data, ",");
                while (stringToken.hasMoreTokens()) {
                    data[i] = stringToken.nextToken();
                    i++;
                }

                if (email.equals(data[0]) && password.equals(data[2])) {
                    return data;
                }
            }
        } catch (Exception e) {
            return data;
        }
        return data;
    }

    public String[] cekEmailUser(String email) throws IOException {
        try(FileReader fileinput = new FileReader(fileRegistrasi);
                BufferedReader bufferedReader = new BufferedReader(fileinput);) {
            String Data;
            bufferedReader.mark(500);
            bufferedReader.reset();

            while (!(Data = bufferedReader.readLine()).isEmpty()) {
                int i = 0;
                stringToken = new StringTokenizer(Data, ",");
                while (stringToken.hasMoreTokens()) {
                    data[i] = stringToken.nextToken();
                    i++;
                }

                if (email.equals(data[0])) {
                    return data;
                }
            }
            
        } catch (Exception e) {
            return data;
        }
        return data;
    }

    private String[] DataKamar() {

        try (FileReader fileReader = new FileReader(fileKamar); BufferedReader kamar = new BufferedReader(fileReader);) {
            kamar.mark(500);
            kamar.reset();
            String Data = kamar.readLine();
            int i = 0;
            while (Data != null) {
                data[i] = Data;
                Data = kamar.readLine();
                i++;
            }
        } catch (Exception e) {
        }
        return data;
    }

    public Kamar[] InisialisasiKamar() {
        data = DataKamar();

        Kamar[] kamar = new Kamar[1000];
        try {
            for (int i = 0; i < 165; i++) {
                kamar[i] = new Kamar(data[i]);
            }
        } catch (IndexOutOfBoundsException exception) {
        }
        return kamar;
    }

    public void menulisDataPenyewa(String nama, String email, String password) throws IOException {
        FileWriter fileOutput = new FileWriter(fileRegistrasi, true);
        try (BufferedWriter bufferOutput = new BufferedWriter(fileOutput);) {
            bufferOutput.newLine();
            bufferOutput.write(email + "," + nama + "," + password);
        } catch (Exception e) {
        }
    }

    public void recordPembelian(User penyewa, String id, String lamaWaktuSewa) throws IOException {
        FileWriter fileOutput = new FileWriter(this.fileRecordPemesanan, true);
        try (BufferedWriter bufferOutput = new BufferedWriter(fileOutput);) {
            bufferOutput.newLine();
            bufferOutput.write(penyewa.getEmail() + "," + id + "," + lamaWaktuSewa);
        } catch (Exception e) {
        }
    }
}

