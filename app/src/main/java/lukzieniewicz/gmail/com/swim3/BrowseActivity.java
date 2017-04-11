package lukzieniewicz.gmail.com.swim3;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BrowseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Settings.setTheme(this);
        setContentView(R.layout.activity_browse);

        showList();
    }

    public void showList(){
        final ArrayList<Movie> list = MainActivity.base.base;

        ListView lv = (ListView) findViewById(R.id.list_view);
        ListAdapter la = new MyAdapter(this, list);
        lv.setAdapter(la);
    }
}
