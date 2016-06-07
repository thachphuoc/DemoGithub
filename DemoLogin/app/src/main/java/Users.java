import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Red on 07-06-16.
 */
public class Users implements Serializable{
    private String id;
    private String pass;
    private boolean autofill;
    private ArrayList<Users> database;

    public Users() {
    }

    public Users(String id, String pass, boolean auto) {
        this.id = id;
        this.pass = pass;
        this.autofill = auto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAutofill() {
        return autofill;
    }

    public void setAutofill(boolean auto) {
        this.autofill = auto;
    }

    public ArrayList<Users> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<Users> database) {
        this.database = database;
    }

    private void addDataBase(Users user)
    {
        database.add(user);
    }

    @Override
    public String toString() {
        return "ID : "+getId()+"\nPass : "+getPass();
    }
}
