package lukzieniewicz.gmail.com.swim3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddDataActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Settings.setTheme(this);
        setContentView(R.layout.activity_add_data);
    }

    public void onAddClick(View view){

        EditText name = ((EditText)findViewById(R.id.name_edit));
        EditText director = ((EditText)findViewById(R.id.director_edit));
        EditText year = ((EditText)findViewById(R.id.year_edit));

        Movie m = new Movie(name.getText().toString(), director.getText().toString(), Integer.parseInt(year.getText().toString()));

        MainActivity.base.base.add(m);
        MainActivity.base.save(this);

        name.setText("");
        director.setText("");
        year.setText("");
    }
}
