import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Red on 07-06-16.
 */
public class Database {
    public void addUser(ArrayList<Users> list)
    {
        Users user = new Users();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("User " + (list.size() + 1));
            System.out.println("ID : ");
            user.setId(input.nextLine());
            System.out.println("Pass : ");
            user.setPass(input.nextLine());
            Scanner in = new Scanner(System.in);
            int flag;
            System.out.println("Chon 1 de luu thong tin - 0 khong luu thong tin : ");
            flag = in.nextInt();
            if (flag == 1) {
                user.setAutofill(true);
                System.out.println("Saved !");
            } else {
                user.setAutofill(false);
                System.out.println("Not saved !");
            }
            list.add(user);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void setDatabase(ArrayList<Users> list)
    {
        ObjectOutputStream oos = null;
        try
        {

            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:/Users/PC14-05/Desktop/list.txt")));
            oos.writeObject(list);
            System.out.println("Added !");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getDatabase()
    {
        Users user = new Users();
        ArrayList<Users> test = new ArrayList<>();
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/Users/PC14-05/Desktop/list.txt")));
            test = (ArrayList<Users>) ois.readObject();
            for (int i=0; i<test.size(); i++)
            {
                System.out.println(test.get(i).toString());
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
