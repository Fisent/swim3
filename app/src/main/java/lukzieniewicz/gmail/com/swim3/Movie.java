package lukzieniewicz.gmail.com.swim3;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Fisent on 10.04.2017.
 */

public class Movie implements Serializable {

    public String name;
    public String director;
    public int year;
    public Drawable image;

    public Movie(String name, String director, int year){
        this.name = name;
        this.director = director;
        this.year = year;
    }

}
