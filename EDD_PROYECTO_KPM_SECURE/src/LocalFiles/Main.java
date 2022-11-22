package LocalFiles;

import GUI.LoginScreen;
import ManualCollections.KPMDataList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        KPMDataList<User> users = getUsers();

        try {
            LoginScreen login = new LoginScreen(users);
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        }catch(Exception e){
            
        }finally{
            saveUsers(users);
        }

    }

    public static void saveUsers(KPMDataList<User> users) {
        try {

            //Crear el directorio en caso de que no exista (Caso poco probable ya que es entorno local)
            String route = "src/resources/data";
            File directory = new File(route);
            if (!directory.exists()) {
                directory.mkdir();
            }
            FileOutputStream openUsersFile = new FileOutputStream(route + "/users.kpmu");
            ObjectOutputStream saveUsersFile = new ObjectOutputStream(openUsersFile);
            saveUsersFile.writeObject(users);
            saveUsersFile.flush();

        } catch (IOException e) {
        }
    }

    private static KPMDataList<User> getUsers() {
        KPMDataList<User> users = new KPMDataList();
        //Bloque try-catch para encontrar los usuarios de tipo Estudiante. En caso de no existir, se mandará el ArrayList nuevo.
        try {

            FileInputStream openUsersFile = new FileInputStream("src/resources/data/users.kpmu");
            ObjectInputStream readUsers = new ObjectInputStream(openUsersFile);
            users = (KPMDataList<User>) readUsers.readObject();

            return users;
        } catch (FileNotFoundException e) {
            // No se pudieron encontrar usuarios.
        } catch (IOException | ClassNotFoundException e) {
        }
        return users;
    }

}
