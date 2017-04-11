package lukzieniewicz.gmail.com.swim3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MovieDetailsActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Settings.setTheme(this);
        setContentView(R.layout.activity_movie_details);

        Movie m = new Movie(getIntent().getExtras().getString("name"), getIntent().getExtras().getString("director"), getIntent().getExtras().getInt("year"));

        ((TextView)findViewById(R.id.detailName)).setText(m.name);
        ((TextView)findViewById(R.id.detailDirector)).setText(m.director);
        ((TextView)findViewById(R.id.detailYear)).setText(Integer.toString(m.year));
    }
}
