package LocalFiles;

import ManualCollections.DoubleList;
import java.io.Serializable;



public class User implements Serializable{

    private String username;
    private String email;
    private String password;
    private DoubleList<Account> accounts;

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.accounts = null;
    }

    public DoubleList<Account> getAccounts() {
        return accounts;
    }
    
    public void setAccounts(DoubleList<Account> accounts) {
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