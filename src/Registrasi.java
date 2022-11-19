package classes;

import java.io.IOException;
import database.database;

public class Registrasi extends User{
    private final String email;
    private final String password;

    public Registrasi (String email, String password) {
        super(email, password);
        this.email = email;
        this.password = password;
    }

    public boolean cekNamaPenyewa() throws IOException {
        String[] data;
        database database = new database();
        data = database.cekDataUser(this.email, this.password);

        if (this.email.equals(data[0]) && this.password.equals(data[2])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }

        return false;
    }

    public boolean cekEmailPenyewa() throws IOException {
        String[] data;
        database database = new database();
        data = database.cekEmailUser(this.email);

        if (this.email.equals(data[0])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }

        return false;
    }

    public void registrasiPenyewa() throws IOException {
        database database = new database();
        database.menulisDataPenyewa(getNama(), getEmail(), getPassword());
    }
}
