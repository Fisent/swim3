package lukzieniewicz.gmail.com.swim3;

import android.app.Activity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Fisent on 10.04.2017.
 */

public class Database implements Serializable {

    public ArrayList<Movie> base = new ArrayList<>();


    public void save(Activity activity){
        try {
            FileOutputStream fos = activity.openFileOutput("base", activity.getApplicationContext().MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(base);
            oos.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void load(Activity activity){
        try{
            FileInputStream fis = activity.openFileInput("base");
            ObjectInputStream is = new ObjectInputStream(fis);
            ArrayList<Movie> simpleClass = (ArrayList<Movie>) is.readObject();
            is.close();
            fis.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
