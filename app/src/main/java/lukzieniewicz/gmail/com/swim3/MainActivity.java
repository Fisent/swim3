package lukzieniewicz.gmail.com.swim3;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    public static Database base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Settings.setTheme(this);
        setContentView(R.layout.activity_main);

        base = new Database();
        base.load(this);

    }

    public void onSettingsClick(View view){
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
    }

    public void onBrowseClick(View view){
        Intent i = new Intent(this, BrowseActivity.class);
        startActivity(i);
    }

    public void onAddClick(View view){
        Intent i = new Intent(this, AddDataActivity.class);
        startActivity(i);
    }
}
