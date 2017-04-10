package lukzieniewicz.gmail.com.swim3;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.widget.Switch;
import android.widget.ToggleButton;

import java.util.Map;

public class Settings extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(this);
        setContentView(R.layout.activity_settings);

        ((ToggleButton) findViewById(R.id.night_mode_toggle)).setChecked(getSharedPreferences("settings", 0).getBoolean("nightMode", false));
    }

    public void onBackClick(View view){
        Intent i = new Intent(this, MainActivity.class);

        getSharedPreferences("settings", 0).edit().putBoolean("big", ((Switch)findViewById(R.id.size_switch)).isChecked()).apply();
        getSharedPreferences("settings", 0).edit().putBoolean("color", ((Switch)findViewById(R.id.color_switch)).isChecked()).apply();

        startActivity(i);
    }

    public void onToggleClick(View view){
        System.out.println("Toggled, hehe");
        ToggleButton tb = (ToggleButton) findViewById(R.id.night_mode_toggle);
        if(!tb.isChecked())
            getSharedPreferences("settings", 0).edit().putBoolean("nightMode", false).apply();
        else
            getSharedPreferences("settings", 0).edit().putBoolean("nightMode", true).apply();

        this.recreate();
    }

    public static void setTheme(Activity giveMeYourself){
        boolean nightMode = giveMeYourself.getSharedPreferences("settings", 0).getBoolean("nightMode", false);
        if(nightMode) {
            System.out.println("Ustawiam ciemny motyw dla tej aktywnosci");
            giveMeYourself.setTheme(R.style.DarkTheme);
        }
        else {
            System.out.println("Ustawiam jasny motyw dla tej aktywnosci");
            giveMeYourself.setTheme(R.style.AppTheme);
        }
    }

    public void onDeleteClick(View view){
        MainActivity.base.base.clear();
        MainActivity.base.save(this);
    }


}
