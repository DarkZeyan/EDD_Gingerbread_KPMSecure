package LocalFiles;

import java.util.ArrayList;


public class User{

    private String username;
    private String password;
    private ArrayList<Account> accounts;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.accounts = null;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    public void setAccounts(ArrayList<Account> accounts) {
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

}