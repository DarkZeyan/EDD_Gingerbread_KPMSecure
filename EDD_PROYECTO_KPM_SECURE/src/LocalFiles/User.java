package LocalFiles;

import ManualCollections.KPMDataList;
import java.io.Serializable;



public class User implements Serializable{

    private String username;
    private String email;
    private String password;
    private KPMDataList<Account> accounts;

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.accounts = new KPMDataList<>();
    }

    public KPMDataList<Account> getAccounts() {
        return accounts;
    }
    
    public void setAccounts(KPMDataList<Account> accounts) {
        this.accounts = accounts;
    }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}