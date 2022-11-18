public class User {
    private String username;
    private String id;
    private String password;

    public User(){

    }

    public User(String username, String id, String password){
        this.username = username;
        this.id = id;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getId(){
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setId(String Id){
        this.id = Id;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
