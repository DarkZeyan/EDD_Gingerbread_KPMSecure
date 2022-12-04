package LocalFiles;

import java.io.Serializable;

public class Account implements Serializable{
    private String platform;
    private String alias;
    private String password;

    public Account(String platform, String alias, String password){
        this.platform = platform;
        this.alias = alias;
        this.password = password;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
