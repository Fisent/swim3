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
        ListAdapter la = new BaseAdapter() {
            LayoutInflater layoutInflater;

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int position) {
                return list.get(position);
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                layoutInflater = LayoutInflater.from(getBaseContext());

                convertView= layoutInflater.inflate(android.R.layout.simple_list_item_1, null);

                TextView txt=(TextView)convertView.findViewById(R.id.textView6);

                txt.setText(list.get(position).toString());

                return convertView;
            }
        };
        lv.setAdapter(la);
    }
}
