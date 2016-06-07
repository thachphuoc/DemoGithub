import java.util.ArrayList;

/**
 * Created by Red on 07-06-16.
 */
public class CheckLogin {
    public static void main(String[] args)
    {
        ArrayList<Users> list = new ArrayList<>();
        Database data = new Database();
        data.addUser(list);
        data.addUser(list);
        data.addUser(list);
        data.setDatabase(list);
        data.getDatabase();
    }
}
