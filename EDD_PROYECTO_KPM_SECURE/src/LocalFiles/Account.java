package LocalFiles;

import java.io.Serializable;

public class Account implements Serializable{
    private String email;
    private String alias;
    private String password;

    public Account(String email, String alias, String password){
        this.email = email;
        this.alias = alias;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
